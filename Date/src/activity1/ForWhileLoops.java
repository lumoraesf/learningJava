package activity1;

import java.util.Scanner;

public class ForWhileLoops {

	public static void main(String[] args) {
		
		String [] names = {"Vanessa", "Lara", "Sandra"};
		System.out.println("Start the program...");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("Student " + (i + 1) + ": " + names [i]);
		}
		
		System.out.println("...");
		System.out.println("The second human on the list is: " + names [1]);
		
	}

}
