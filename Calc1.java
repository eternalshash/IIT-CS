package lab_Ten;

import java.util.Scanner;

public class Calc1 {
	public static void main(String args[]) {
		System.out.println("Format : A operator B, where A and B are any value"); // remove spaces?
		System.out.println("Allowed operators: + - * / ^");
		System.out.println("Sample expressions: 6 + 9, 2 - 23, 0 * 9, 28 / 13, 6 ^ 2");
		System.out.println("***********************************************");
		//
		System.out.println("                                               ");
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression to evaluate: ");
        String input = scanner.nextLine();
		Calc2 c2  = new Calc2 (input);
		System.out.println("Answer: " + c2.evaluate());
		scanner.close();
	}

}
