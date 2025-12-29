package ioFinal;

import java.io.*;
import java.util.Scanner;

public class MiniRegister {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		int option;
		
		do {
			System.out.println("1. Add product");
			System.out.println("2. Show products");
			System.out.println("3. Exit");
			
			option = sc.nextInt();
			sc.nextLine();
			
			if (option == 1) {
				addProduct();
			} else if (option == 2) {
				showProducts();
			}
		} while (option != 3);
	}
	
	static void addProduct() throws IOException {
		// this would overwrite
		// PrintWriter wr = new PrintWriter(new FileWriter("products.csv"));
		
		// append mode
		PrintWriter wr = new PrintWriter(new FileWriter("products.csv", true));
		
		System.out.print("Product name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: $");
		double price = sc.nextDouble();
		sc.nextLine();
		
		wr.println(name + "," + price);
		
		wr.close();
	}
	
	static void showProducts() throws FileNotFoundException {
		File file = new File("products.csv");
		
		if (!file.exists()) {
			System.out.println("No products yet.");
			return;
		}
		
		Scanner fileReader = new Scanner(file);

		while(fileReader.hasNextLine()) {
			// to avoid mixing nextInt() with nextLine()
			String line = fileReader.nextLine();
			System.out.println(line);
		}
		
		fileReader.close();
	}
}
