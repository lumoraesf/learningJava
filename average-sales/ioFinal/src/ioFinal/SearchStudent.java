package ioFinal;

import java.io.*;
import java.util.Scanner;

public class SearchStudent {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name to search: ");
		// name will be stored in memory
		String searchName = sc.nextLine();
		
		// going through the file
		Scanner file = new Scanner(new File("students.csv"));
		boolean found = false;
		
		while(file.hasNextLine()) {
			String line = file.nextLine();
			
			if (line.startsWith(searchName + ",")) {
				System.out.println("Found: " + line);
				found = true;
			}
		}
		
		file.close();
		sc.close();
		
		if(!found) {
			System.out.println("Student not found");
		}
	}

}
