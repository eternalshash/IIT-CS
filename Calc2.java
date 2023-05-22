package lab_Ten;

import java.util.Arrays;

public class Calc2 {
	private String c2;
	private double num1;
	private double num2;
	private char operator;
	public Calc2 (String n){
	    c2 = n;
	    boolean check = true;
	    String[] numbers = n.split("\\s+"); // take out all the spaces in the string
	    System.out.println(Arrays.toString(numbers));
	    //int[] results = new int[numbers.length];
	    
	    
	    for(String numbers1 : numbers) { // attempting to check the operator the user enters
	    	try {
	    		Double.parseDouble(numbers1);
	    		
	    	} catch (NumberFormatException e) {
	    		if (!numbers1.matches("[+\\-*/^]")){
	    			check = false;
	    			break;
	    		}
	    	}
	    	//(!part.matches("[+\\-*/^]")) attempt one - disregard
	    }
	    
	    if(check) {
	    	System.out.println("Valid expression!"); // passing it through
	    	convertInt(c2);
	    } else {
	    	System.out.println("Invalid expression!");
	    	System.exit(0); // check if there is a more efficient method
	    }
	    

	    
	}
	public void convertInt(String c2) {
		
		System.out.println("String with white spaced removed is: " + c2.replaceAll("\\s+", "")); 
		
		int operatorIndex = -1;
		for(int i = 0; i < c2.length(); i++) {
			operator = c2.charAt(i);
			if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '^' ) {
				operatorIndex = i;
				break;
				
			} //check for the operator then identify it (per iteration)
		}
		
		if(operatorIndex == -1) {
			System.out.println("Invalid expression");
			return;
		}
		
		num1 = Double.parseDouble(c2.substring(0, operatorIndex)); // extracting the number from the string
        num2 = Double.parseDouble(c2.substring(operatorIndex + 1)); // extracting the number from the string
        operator = c2.charAt(operatorIndex);

        System.out.println(num1); // for validation purposes(following lines as well)
        System.out.println(operator);
        System.out.println(num2);        
                
	}
	public Calc2 (int num1,int num2, char operator ) {
		this.num1 = num1;
		this.num2 = num2; // ? 
		this.operator = operator;
		
	}
	
	public double evaluate() {
		switch (operator){ // basic switch to evaluate the user operation
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			case '/':
				return num1 / num2;
			case '*':
				return num1 * num2;
			case '^': 
				return (int) Math.pow(num1, num2);
			default:
				System.out.println("Invalid Operator Selected: try again."); // fail safe just in case there is an error
				return 0;
		}
		
	}
	
	

}
