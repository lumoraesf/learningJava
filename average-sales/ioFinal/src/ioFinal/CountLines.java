package ioFinal;
import java.io.*;
import java.util.Scanner;

public class CountLines {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file name: ");
		System.out.println("Lines: " + countLines(sc.nextLine()));
		
		sc.close();
	}
	
	
	static int countLines(String fileName) {
		int count = 0;
		try {
			Scanner file = new Scanner(new File(fileName));
			
			while (file.hasNextLine()) {
				file.nextLine(); // moves to next line
				count++;
			}
			
			file.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		return count;
	}

}
