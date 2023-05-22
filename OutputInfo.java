package lab_Ten;

public class OutputInfo {
	public static void displayStudentInfo(Id2 student) {
		
		try {
			
			System.out.println("Student ID: " + student.getID());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

		
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
	}

}
