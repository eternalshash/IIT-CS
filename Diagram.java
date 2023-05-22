package lab_Ten;


import java.util.Scanner;
import java.util.Arrays;


public class Diagram {
	public static void main(String args[]) {
		boolean qualify = true;
		int stepcount = 0;
		
		System.out.println("What is your Salary ?:  ");
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		
		String[] check1 = {input};
		//System.out.println(Arrays.toString(check1));
		
		for(int i = 0; i < check1.length; i++) {
			String output1 = check1[i].replaceAll("\\s", "");
			
		}
		
		try { 
			if(input.matches("[0-9]+")) {
				int salVal = Integer.parseInt(input);
				System.out.println(salVal + " is your inputed salary");
				if(salVal > 6000) {
					stepcount++;
					System.out.println("You have passed " + stepcount + " of 2 steps needed");
				}else {
					qualify = false;
					System.out.println("Your salary is too low");
					System.exit(0);
				}
				
			}else {
				throw new NumberFormatException();
			}
	
		} catch (NumberFormatException e) {
			qualify = false;
			System.out.println("Invalid Expression entered for Salary");
			System.exit(0);
			
		}
		
		System.out.println("How many years have you worked for?: ");
		
		Scanner scan2 = new Scanner(System.in);
		
		String amntY = scanner.nextLine();
		
		String[] in2 = {amntY};
		
		for(int i = 0; i < in2.length; i++) {
			String output2 = in2[i].replaceAll("\\s", "");
			
		}
		
		try {
			if(amntY.matches("[0-9]+")) {
				int checkWrk = Integer.parseInt(amntY);
				System.out.println("You have worked for " + checkWrk + " year(s)");
				
				if(checkWrk > 3) {
					stepcount++;
					qualify = true;
					System.out.println("You have passed " + stepcount + " of 2 steps needed");
					System.out.println("You have qualified");
				}else {
					qualify = false;
					System.out.println("Your work expererience is too low");
					System.out.println("You have not qualified ");
					System.exit(0);
				}
				
			}else {
				throw new NumberFormatException();
			}
			
		} catch (NumberFormatException e) {
			qualify = false;
			System.out.println("Invalid values entered for years worked");
			System.exit(0);
		}
		
		
		scanner.close();
		scanner.close();

		
	}
}
