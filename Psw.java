package lab_Ten;

import java.util.Scanner;

public class Psw {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Login Name: "); 
		
	    String loginName = scan.nextLine(); 
		
		
		if(loginName.equals("admin")) {
			System.out.println("check void");
			
			Scanner scanP = new Scanner(System.in);
			
			System.out.println("Enter password: ");
			
			String spass = scan.nextLine();
			
			
			if(spass.equals("password")) {
				System.out.println("correct");
			} else {
				System.out.println("Wrong c2");
			}
			
		}else {
			System.out.println("you enterned " + loginName + " which is not accepted");
		}
		
	}

}
