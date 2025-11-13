package lab03;

import java.util.ArrayList;
import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Tem> Tems = new ArrayList<> ();
		
		System.out.println("Welcome to Tempeature Conversion System");
		System.out.println("---------------------------------------");
		
		
		System.out.print("Please Enter The Amount of City you want to Check: ");
		int NoC = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 1; i <= NoC; i++) {
			System.out.println("\nCity "+ i +":");
			
			System.out.print("Please Enter Your City Name: ");
			String City = scanner.nextLine(); 
			
			System.out.print("Please Enter Your City Temperature in °C: ");
			float C = scanner.nextFloat(); 
			scanner.nextLine();
			
			float F = (C*(9/5)) + 32;
			
			Tem NTem = new Tem(C, F, City);
			Tems.add(NTem);
		}
		
		scanner.close();
		
		System.out.print("\n-----City Temperature List----- ");
		for (int i = 0; i < Tems.size(); i++) {
			System.out.print("\n\nCity" + (i+1) + ": ");
			System.out.println(Tems.get(i));
		}
	}
}
