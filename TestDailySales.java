package lab_Ten;

import java.util.Scanner;

public class TestDailySales {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int daysSoldPerMonth = 31;
		DailySales sales = new DailySales(daysSoldPerMonth);
		
		
		System.out.println("What month sales would you like to enter: i.e. Jan, Feb, Mar, ... : (Enter Value)");
		String months = input.nextLine();
		
		if(months.equals("Jan") || months.equals("March") || months.equals("May") 
		|| months.equals("Jul") || months.equals("Aug") || months.equals("Oct") || months.equals("Dec") ) {
			daysSoldPerMonth =+ 1;
		}else {
			daysSoldPerMonth =+ 0;
		}
		
		int sale;
		int count = 0;
		for(int i = 0; i < sales.maxDay(); i++)
		{
			boolean isValid;
			do
			{
			System.out.print("Enter sale for Day #" + (i + 1) + ": ");
			sale = input.nextInt();
			isValid = sales.addSales(i+1, sale);
			}while(!isValid);
		}


		
		System.out.println("The day with most sales is: " + sales.dayWithMaxSale());
		//unable to get all the same value turn around 
		
		
		//count = 0;
		int[] salesLessThanGoal = sales.daysBelowGoal();
		for(int i  = 0; i <= salesLessThanGoal.length; i++){
			count++;
			
			
		}
		System.out.println("There were " + (count - 1) + " days below the sales goal.");
		
		
		input.close();
	}
}