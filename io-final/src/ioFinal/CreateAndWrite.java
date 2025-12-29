package ioFinal;

// lets Java work with files
import java.io.*;
import java.util.Scanner;

public class CreateAndWrite {

	// type static so all methods can use the scanner
	// and so it can be declared outside main
	static Scanner sc = new Scanner(System.in);
	
	// if an issue occurs, do not solve it here
	public static void main(String[] args) throws IOException {
		
		// asks user for filename
		// method will be created
		String fileName = askFileName();
		
		// create file if it doesn't exist
		// method will be created
		createFile(fileName);
		
		// write 3 sentences into the file
		// method will be created
		writeSentences(fileName);
		
		// code to check if worked
		// Scanner file = new Scanner(new File(fileName));
		// while (file.hasNextLine()) {
		//  	System.out.println(file.nextLine());
		// }
		// file.close();
	}
	
	// returns a string - what the user typed in
	// takes in no arguments
	// text in memory - no files created yet
	static String askFileName() {
		System.out.print("Enter file name: ");
		return sc.nextLine();
	}
	
	// takes fileName as argument
	// doesn't handle mistakes
	static void createFile(String fileName) throws IOException {
		// creates a file object - reference
		// file object = Java object that POINTS to a path
		// no file created yet
		File file = new File(fileName);
		
		// if the file doesn't exist, create it
		if (!file.exists()) {
			file.createNewFile();
		}
	}
	
	static void writeSentences(String fileName) throws IOException {
		// connect to file, write text
		
		// new FileWriter(fileName) opens a connection to file
		// or creates it if it doesn't exist
		
		// new PrintWriter(...) knows how to write text
		// doesn't know what file to use - must be put inside 
		// the parenthesis
		
		// PrintWriter writer saves the tool so you can reuse it
		
		//"Create a FileWriter to connect to the file, 
		// then give it to a PrintWriter so I can write text, 
		// and store it in a variable called writer"
		PrintWriter writer = new PrintWriter(new FileWriter(fileName));
		
		for (int i = 1; i <= 3; i++) {
			System.out.print("Enter sentence " + i + ": ");
			// writes sentence to file
			writer.println(sc.nextLine());
		}
		
		writer.close();
	}

}
