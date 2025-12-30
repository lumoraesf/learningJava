package activity1;

import java.util.Scanner;

public class Activity {

	public static void main(String[] args) {
		// declare input data
		int Day, Year;
		String Month;
		
		Boolean Date = false; // true only when date is correct
		Scanner sc = new Scanner(System.in);
		
		//ask the user for input
		System.out.println("Introduce the date: ");
		System.out.println("Day: ");
		//initialize the variables with the updated information
		Day = sc.nextInt();
		
		System.out.println("Month: ");
		Month = sc.next();
		
		System.out.println("Year: ");
		Year = sc.nextInt();
		
		//data validation and output
		if (Year > 0) {
			if(Month.equals("february") && Day >= 1 && Day <= 28) {
				Date = true;
				System.out.println("This day exists in February.");
				System.out.println("Great, the day is "+Day+"in february of "+Year);
			} else if (Month.equals("january") || Month.equals("march") ||
				 Month.equals("may") || Month.equals("july") || Month.equals("august")
				  || Month.equals("october") || Month.equals("december") && 
				  Day >= 1 && Day <= 31) {
						Date = true;
						System.out.println("Great, the day is "+Day+"in "+Month+" of "+Year);
			} else if (Month.equals("february") && Day >28 
				  || Month.equals("february") && Day < 1) {
						Date = false;
						System.out.println("This day does not exist in February.");
			} else if (Month.equals("april") || Month.equals("june") ||
					 Month.equals("september") || Month.equals("november") && 
					  Day >= 1 && Day <= 30) {
							Date = true;
							System.out.println("Great, the day is "+Day+" in "+Month+" of "+Year);
			}
		}
		
		else {
			System.out.println("Error! The year is incorrect.");
			Date = false;
		}
	}

}
