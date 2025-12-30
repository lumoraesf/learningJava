package activity1;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		System.out.println("Start the program...");
		
		Scanner sc = new Scanner (System.in);
		int sum = 0;
		
		System.out.println("Enter a number: ");
		int limit = sc.nextInt();
		
		for (int i = 1; i<= limit; i++) {
			if (i % 2 == 0) {
				sum += i;
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}
	}

}
