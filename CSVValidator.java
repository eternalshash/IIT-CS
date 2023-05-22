package finalProject.one;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CSVValidator extends CSVreader {
    public CSVValidator(String fileName) {
        super(fileName);
    }

    // Method to check for repeated values in ID column
    public boolean hasRepeatedValues() {
        Set<String> idSet = new HashSet<>();
        for (int i = 1; i < csvData.size(); i++) {
            String id = csvData.get(i)[0];
            if (idSet.contains(id)) {
                return true;
            } else {
                idSet.add(id);
            }
        }
        return false;
    }

    // Method to check for blank entries in the CSV data
    public boolean hasBlankEntries() {
        for (String[] row : csvData) {
            for (String entry : row) {
                if (entry.trim().isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    // Method to check for valid ID types and department values
    public boolean hasInvalidIDTypesAndDepartments() {
        for (int i = 1; i < csvData.size(); i++) {
            String idType = csvData.get(i)[1];
            String department = csvData.get(i)[4];

            if (!(idType.equalsIgnoreCase("T") || idType.equalsIgnoreCase("S") || idType.equalsIgnoreCase("F"))) {
                return true;
            }

            if (idType.equalsIgnoreCase("T")) {
                try {
                    float departmentValue = Float.parseFloat(department);
                    if (!(departmentValue < 300000)) {
                        return true;
                    }
                } catch (NumberFormatException e) {
                    return true;
                }
            } else if (!(department.equalsIgnoreCase("CS") || department.equalsIgnoreCase("CAE") ||
                    department.equalsIgnoreCase("CHEM") || department.equalsIgnoreCase("MMAE"))) {
                return true;
            }
        }
        return false;
    }

    // Method to validate the CSV data
    public void validateCSVData() {
        if (hasRepeatedValues()) {
            System.out.println("Error: The CSV file contains repeated values in the ID column.");
            //System.exit(0);
        }else if (hasBlankEntries()) {
            System.out.println("Error: The CSV file contains blank entries.");
            //System.exit(0);
        }else {
        	System.out.println("CSV data validation passed successfully!");
        }
        
        if (hasInvalidIDTypesAndDepartments()) {
            System.out.println("Error: The CSV file contains invalid ID types or department values.");
            //System.exit(0);
        }

        if (!hasRepeatedValues() && !hasBlankEntries() && !hasInvalidIDTypesAndDepartments()) {
            System.out.println("CSV data validation passed successfully!");
        }
        
    }
}

