package lab03;

import java.util.Scanner;
import java.util.ArrayList;

public class Library {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Book> books = new ArrayList<> ();
		float total = 0;
		
		System.out.println("WELCOME TO THE LIBRARY");
		System.out.println("----------------------");
		
		System.out.print("Please Enter The Amount Of Book: ");
		int NoB = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 1; i <= NoB; i++) {
			System.out.println("\nBook "+ i +":");
			
			System.out.print("Please Enter The Book ID: ");
			float idB = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Please Enter The Title: ");
			String BT = scanner.nextLine();
			
			System.out.print("Please Enter The Author: ");
			String BA = scanner.nextLine();
			
			System.out.print("Please Enter the Price of the Book: ");
			float Price = scanner.nextFloat();
			scanner.nextLine();
			
			Book book1 = new Book(idB, BT, BA, Price);
			books.add(book1);
			
			total += Price;
		}
		
		scanner.close();
		
		System.out.print("\n-----Library Book List----- ");
		for (int i = 0; i < books.size(); i++) {
			System.out.print("\n\nBook" + (i+1) + ": ");
			System.out.println(books.get(i));
		}
		
		float avg = total/NoB; 
		System.out.print("\n\nThe Avarage Price is: $" + avg);
	}
}




