package lab03;

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManagement {
	public static void main(String[] arg) {
		
		System.out.println("Welcome to Inventory Management System");
		System.out.println("--------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Item> Items = new ArrayList<> ();
		
		float tot = 0;
		
		System.out.print("Enter the Amount of Item You Want to Check: ");
		int NoI = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 1; i <= NoI; i++) {
			System.out.println("\nItem "+ i +":");
			
			System.out.print("Please Enter Item ID: ");
			int ID = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Please Enter Item Name: ");
			String name = scanner.nextLine();

			System.out.print("Please Enter Item Price: ");
			float price = scanner.nextFloat();
			
			Item I = new Item( ID, name, price);
			Items.add(I);
			
			tot += price;
		}
		
		scanner.close();
		
		System.out.print("\n-----Item Management List----- ");
		for (int i = 0; i < Items.size(); i++) {
			System.out.print("\n\nItem" + (i+1) + ": ");
			System.out.println(Items.get(i));
		}
		
		System.out.print("\n\n---The Total is:" + tot + "---" );
	}
}
