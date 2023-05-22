package finalProject.one;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * 1. need to write test case for the file not having a header
 * 2. check other stuff along the loop conditions 
 * 3. Check blank conditions
 * 
 */




public class CSVreader {
    private String file;
    protected List<String[]> csvData; // to store the parsed CSV data
    private Comparator<String[]> comparator; // to compare rows based on user input

    public CSVreader(String file) {
        this.file = file;
        this.csvData = new ArrayList<>();
    }

    public void readCSVData() {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            reader.readLine();
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                csvData.add(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void displayCSVData() {
        if (csvData.isEmpty()) {
            System.out.println("No data found.");
            return;
        }

        for (String[] row : csvData) {
            for (String index : row) {
                System.out.printf("%-15s", index);
            }
            System.out.println();
        }
    }

    public void sortCSVData(String sortBy) {
        switch (sortBy.toLowerCase()) {
            case "id type", "ID", "id": // works shows header??
                comparator = Comparator.comparing(row -> row[0]); //p_skip_rows => 1
                break;
            case "a number" , "A number", "A Number", "a Number": // works not showing header
                comparator = Comparator.comparing(row -> row[1]);
                break;
            case "first name", "first", "First Name","First name": // works showing header
                comparator = Comparator.comparing(row -> row[2]);
                break;
            case "last name" ,"last", "Last Name","Last name": // works showing header
                comparator = Comparator.comparing(row -> row[3]);
                break;
            case "age", "Age": // works showing header!
                comparator = Comparator.comparing(row -> row[4]);
                break;
            case "department": // n
                comparator = Comparator.comparing(row -> row[5]);
                break;
            default:
                System.out.println("Invalid sort option.");
                return;
        }

        csvData.sort(comparator);
        System.out.println("CSV data sorted by " + sortBy + ":");
        displayCSVData();
    }

	public void addCSVData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values for the CSV in the following format:");
        System.out.println("ID TYPE, A NUMBER, FIRST NAME, LAST NAME, AGE, DEPARTMENT");
        String input = scanner.nextLine();
        String[] values = input.split(",");
        
        scanner.close();

        // ADD THE CHECK FOR THE A NUMBER LENGTH!!!!!!!!!
        
        // Validate input
        if (values.length != 6) {
            System.out.println("Invalid input format.");
            return;
        }

        String idType = values[0].trim();
        String aNumber = values[1].trim();
        String firstName = values[2].trim();
        String lastName = values[3].trim();
        String age = values[4].trim();
        String department = values[5].trim();

        try {
            // Validate ID Type
            if (!idType.equalsIgnoreCase("S") && !idType.equalsIgnoreCase("F") && !idType.equalsIgnoreCase("T")) {
            	
                throw new IllegalArgumentException("MAIN ERROR -> Invalid ID Type. Only 'S', 'F', or 'T' allowed.");
            } else if (aNumber.isEmpty() || aNumber.length() == 11) { // Validate A Number -- NOT WORKING?
            	
                throw new IllegalArgumentException("MAIN ERROR -> Invalid A Number. A Number cannot be blank or exceed 10 characters "
                		+ "or be less than 10 characters .");
                
            } else if (!age.matches("\\d+")) { // Validate Age
                throw new IllegalArgumentException("MAIN ERROR -> Invalid Age. Age must be a number.");
                
            } else if (!department.equalsIgnoreCase("CS") && !department.equalsIgnoreCase("CAE") &&
                    !department.equalsIgnoreCase("CHEM") && !department.equalsIgnoreCase("MMAE") && !department.equalsIgnoreCase("CE") &&
                    !department.equalsIgnoreCase("MENG") && !department.equalsIgnoreCase("AE") && !department.equalsIgnoreCase("ARCH")) { // Validate Department
            	
                throw new IllegalArgumentException("Invalid Department. reference IIT to check!.");
            }
            
            String[] row = {idType, aNumber, firstName, lastName, age, department};
            csvData.add(row);
            System.out.println("Data added to the CSV.");
            
            
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //S,A22222325,Shashwat,Choudhry,18,CS
        
        //csvData.add(values);
        //System.out.println("Data added to the CSV.");
        
	}
}

// CSVEditor class to add values to the CSV list
class CSVEditor extends CSVreader {
    public CSVEditor(String file) {
        super(file);
    }


    // Override displayCSVData method to hide implementation details
    @Override
    public void displayCSVData() {
        if (csvData.isEmpty()) {
            System.out.println("No data found.");
            return;
        }
        
    }
}

       