package sales;

public class WeekDetails {

	public static void main(String[] args) {
		double week1 = 1250.2;
		double week2 = 2500;
		double week3 = 500.7;
		double week4 = 650;
		
		double sumWeeks = week1 + week2 + week3 + week4;
		double lengthWeeks = 4;
		
		double averageMonth = sumWeeks / lengthWeeks;
		
		System.out.println("The average sales for the month were $" + averageMonth);

	}

}
