package ioFinal;

import java.io.*;
import java.util.Scanner;

public class TextToCSV {

	public static void main(String[] args) throws IOException {
		Scanner txt = new Scanner (new File("data.txt"));
		PrintWriter csv = new PrintWriter(new FileWriter("data.csv"));
		
		int line = 1;
		
		while (txt.hasNextLine()) {
			csv.println(line + "," + txt.nextLine());
			line++;
		}
		
		txt.close();
		csv.close();
	}

}
