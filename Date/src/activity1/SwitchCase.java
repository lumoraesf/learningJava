package activity1;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("Enter your grade (0-10)");
		
		int grade = input.nextInt();
		
		switch(grade) {
		case 10:
			System.out.println("Excellent!");
		break;
			
		case 6:
			System.out.println("Satisfactory");
		break;
			
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Fail");
		break;
			
		default:
			System.out.println("Invalid grade!");
		}

	}

}
