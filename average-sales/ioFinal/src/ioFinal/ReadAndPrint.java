package ioFinal;
import java.io.*;
import java.util.Scanner;

public class ReadAndPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file name: ");
		
		readFile(sc.nextLine());
		
		sc.close();
	}
	
	// function parameters are born when the function is called
	// this means the function is expecting a string,
	// which inside the method I'll call fileName
	static void readFile(String fileName) {
		try {
			Scanner file = new Scanner(new File(fileName));
			int lineNumber = 1;
			
			while (file.hasNextLine()) {
				System.out.println(lineNumber + ": " + file.nextLine());
				lineNumber++;
			}
			
			file.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

}
