package ioFinal;

import java.io.*;
// import java.util.Locale;
import java.util.Scanner;

public class FileForStudents {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		// in case you don't want to modify values in excel
		// due to comma and semicolon confusion
		// not recommended if user is human
		// Locale.setDefault(Locale.US);
		
		for (int i = 1; i <= 3; i++) {
			writeStudent();
		}
	}
	
	static void writeStudent() throws IOException {
		PrintWriter wr = new PrintWriter(new FileWriter("students.csv", true));
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Age: ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.print("Grade: ");
		double grade = Double.parseDouble(sc.nextLine());
		
		wr.println(name + "," + age + "," + grade);
		
		wr.close();
	}

}
