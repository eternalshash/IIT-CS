package finalProject.one;


import java.io.*;
import java.util.*;

// Abstract class to define the common structure of CSV data objects
abstract class CSVData {
    protected String[] data;

    public CSVData(String[] data) {
        this.data = data;
    }

    public abstract void display();
}

// Interface to define the methods for adding data to a CSV file
interface CSVDataWriter {
    void writeData(String[] data);
}

// Class to represent the CSV data for a particular row
class CSVRowData extends CSVData {
    public CSVRowData(String[] data) {
        super(data);
    }

    @Override
    public void display() {
        for (String index : data) {
            System.out.printf("%-15s", index);
        }
        System.out.println();
    }
}

// Class to represent the CSV data for a new row to be added
class CSVNewRowData extends CSVData {
    public CSVNewRowData(String[] data) {
        super(data);
    }

    @Override
    public void display() {
        System.out.println("New row data:");
        for (String index : data) {
            System.out.println(index);
        }
    }
}

// Class to add data to a CSV file
public class CSVWriter implements CSVDataWriter {
    private String file;
    private List<String[]> csvData;

    public CSVWriter(String file) {
        this.file = file;
        this.csvData = new ArrayList<>();
    }

    public void readCSVData() {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String line;
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
            case "id type":
                csvData.sort(Comparator.comparing(row -> row[0]));
                break;
            case "a number":
                csvData.sort(Comparator.comparing(row -> row[1]));
                break;
            case "first name":
                csvData.sort(Comparator.comparing(row -> row[2]));
                break;
            case "last name":
                csvData.sort(Comparator.comparing(row -> row[3]));
                break;
            case "age":
                csvData.sort(Comparator.comparingInt(row -> Integer.parseInt(row[4])));
                break;
            case "department":
                csvData.sort(Comparator.comparing(row -> row[5]));
                break;
            default:
                System.out.println("Invalid sort option.");
                return;
        }

        System.out.println("CSV data sorted by " + sortBy + ":");
        displayCSVData();
    }

    @Override
    public void writeData(String[] data) {
        csvData.add(data);
        System.out.println("Data added to CSV file:");
        //CSVData newRowData = new CSVNewRow;
        		
    }
}
