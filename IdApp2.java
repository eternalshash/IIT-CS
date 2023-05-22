package lab_Ten;

import java.util.Arrays;

public class IdApp2 {
	private String checkA; 
	public String nameC1;
	public String nameC2;
	public IdApp2 (String a) {
		a = checkA;
		//name = nameC1;
		//name2 = nameC2;
		
		String[] numbers = checkA.split("\\s+"); // take out all the spaces in the string
	    System.out.println(Arrays.toString(numbers));
		
		System.out.println("Your A number is: " + checkA);
		
		
		
		
		
	}
}
