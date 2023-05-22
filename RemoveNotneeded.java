package finalProject.one;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveNotneeded extends CSVValidator {

    public RemoveNotneeded(String fileName) {
        super(fileName);
    }

    // Method to remove lines with errors
    private void removeErrorLine(int errorLine) {
        csvData.remove(errorLine);
    }

    // Method to output the CSV file without the error line
    private void outputCSVFile() {
        try {
            String fileName = "/Users/shashwanki/Desktop/IdealSpread - Sheet1.csv";
			FileWriter csvWriter = new FileWriter(fileName);
            for (String[] row : csvData) {
                csvWriter.append(String.join(",", row));
                csvWriter.append("\n");
            }
            csvWriter.flush();
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to validate the CSV data and remove error line(s) if there is an error
    public void validateCSVDataAndRemoveErrorLine() {
        boolean hasError = false;
        int errorLine = -1;

        if (hasRepeatedValues()) {
            System.out.println("Error: The CSV file contains repeated values in the ID column.");
            hasError = true;
            errorLine = findErrorLine(0);
        } else if (hasBlankEntries()) {
            System.out.println("Error: The CSV file contains blank entries.");
            hasError = true;
            errorLine = findErrorLine(-1);
        } else if (hasInvalidIDTypesAndDepartments()) {
            System.out.println("Error: The CSV file contains invalid ID types or department values.");
            hasError = true;
            errorLine = findErrorLine(1);
        }

        if (hasError) {
            removeErrorLine(errorLine);
            outputCSVFile();
            System.out.println("Error line removed from CSV file.");
            System.exit(0);
        } else {
            System.out.println("CSV data validation passed successfully!");
        }
    }

    // Method to find the line number of the error
    private int findErrorLine(int column) {
        for (int i = 1; i < csvData.size(); i++) {
            String value = csvData.get(i)[column];
            if (value.trim().isEmpty() || (column == 0 && countOccurrences(value) > 1) ||
                    (column == 1 && !(value.equalsIgnoreCase("T") || value.equalsIgnoreCase("S") || value.equalsIgnoreCase("F"))) ||
                    (column == 4 && !(value.equalsIgnoreCase("CS") || value.equalsIgnoreCase("CAE") ||
                            value.equalsIgnoreCase("CHEM") || value.equalsIgnoreCase("MMAE")))) {
                return i;
            }
        }
        return -1;
    }

    // Method to count the number of occurrences of a value in the ID column
    private int countOccurrences(String value) {
        int count = 0;
        for (int i = 1; i < csvData.size(); i++) {
            if (csvData.get(i)[0].equals(value)) {
                count++;
            }
        }
        return count;
    }
}
