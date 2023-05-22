package lab_Ten;

public class DailySales {
	private int[] dailySales;
	
	//default constructor that creates an array for sales for 31 days
	public DailySales() {
		dailySales = new int[31];
	}
	
	//constructor that creates an array for sales for user specified days
	public DailySales(int daysInMonth) {
		dailySales = new int[daysInMonth];
	}
	
	//method that adds sales
	public boolean addSales(int dayNumber, int sales) {
	//check if the dayNumber and sales are valid
		if (1 <= dayNumber && dayNumber <= dailySales.length && sales > 0)
		{
		//add sales to array
			dailySales[dayNumber - 1] = sales;
			return true;
		} else {
			return false;
		}
	
	}
	
	public int maxDay() {
		return dailySales.length;
	}
	
	public int[] daysBelowGoal() {
		int salesLessThan100Count = 0;
		for (int i = 0; i < dailySales.length; i++) {
		if (dailySales[i] <= 100)
			salesLessThan100Count += 1;
		}
		int[] daysLessSales = new int[salesLessThan100Count];
		int index = 0;
		for (int i = 0; i < dailySales.length; i++)
		{
			if (dailySales[i] <= 100) {
			daysLessSales[index] = i + 1;
			index++;
		}
	}
	return daysLessSales;
	}
	
	public int dayWithMaxSale() {
		int maxDay = 0;
		int maxSale = dailySales[maxDay];
		for(int i = 0; i < dailySales.length; i++) {
		if(dailySales[i] > maxSale) {
			maxSale = dailySales[i];
			maxDay = i;
		}
	}
	return (maxDay + 1);
	}
}




