package ioFinal;

import java.io.*;
import java.util.Scanner;

public class AverageNumbers {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		writeNumbers();
		calculateAverage();
	}
	
	static void writeNumbers() throws IOException {
		PrintWriter wr = new PrintWriter(new FileWriter("numbers.txt"));
		System.out.print("How many numbers?");
		int numbers = sc.nextInt();
		
		for (int i = 0; i < numbers; i++) {
			System.out.print("Number: ");
			// writes number into file
			wr.println(sc.nextDouble());
		}
		
		wr.close();
	}
	
	static void calculateAverage() throws FileNotFoundException {
		Scanner file = new Scanner(new File("numbers.txt"));
		double sum = 0;
		int count = 0;
		
		while (file.hasNextLine()) {
		    // had to substitute hasNextDouble()
			// because of invisible characters
			String line = file.nextLine().trim(); // removes white spaces
		    double value = Double.parseDouble(line); // transforms text into double
		    sum += value;
		    count++;
		}

		
		file.close();
		
		double average = (sum / count);
		
		System.out.println("Average: " + average);
	}

}
