package finalProject.one;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the (FAKE)IIT database system, what would you like to do (display, add, or remove)?: ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("display")) {
            String file = "/Users/shashwanki/Desktop/IdealSpread - Sheet1.csv";
            CSVValidator csvValidator = new CSVValidator(file);
            csvValidator.readCSVData();
            csvValidator.displayCSVData();
            csvValidator.validateCSVData();

            System.out.print("How would you like to sort the data (ID type, A NUMBER, First Name, Last Name, Age, Department)?: ");
            String sortBy = scanner.nextLine();
            csvValidator.sortCSVData(sortBy);
        }
            
        //csvReader.displayCSVData();
 
        //ID TYPE        A NUMBER       FIRST NAME     LAST NAME      AGE            DEPARTMENT 
        
        //System.out.print("How would you like to sort the data (ID type, A NUMBER, First Name, Last Name, Age, Department)?: ");
        //String sortBy = scanner.nextLine();
        //csvReader.sortCSVData(sortBy);
            
        
        // /Users/shashwanki/Desktop/IdealSpread - Sheet1.csv
        // /Users/shashwanki/Desktop/SpreadwithoutHeader - Sheet1.csv
        
        
         
        else if (input.equalsIgnoreCase("add")) {
            String file = "/Users/shashwanki/Desktop/IdealSpread - Sheet1.csv";
            CSVreader csvEditor = new CSVreader(file);
            csvEditor.readCSVData();
            csvEditor.displayCSVData();
            
            CSVValidator csvValidator = new CSVValidator(file);
            csvValidator.readCSVData();
            //csvValidator.displayCSVData();
            //csvValidator.validateCSVData();
            
            //VALIDATION CHECK!!!!!
            csvEditor.addCSVData();
            
            csvValidator.validateCSVData();
            
            csvEditor.displayCSVData();
           
        } else if (input.equalsIgnoreCase("remove")) {
        	 String file = "/Users/shashwanki/Desktop/IdealSpread - Sheet1.csv";
             CSVremover csvEditor2 = new CSVremover(file);
             csvEditor2.readCSVData();
             csvEditor2.displayCSVData();
             //csvEditor2.removeCSVData();
             //csvEditor2.displayCSVData();
        	
            
        } else {
            System.out.println("Invalid input. Exiting...");
            System.exit(0);
        }

        scanner.close();
    }
}
