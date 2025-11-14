package lab03;

import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeSalary {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Salary> Salarys = new ArrayList<> ();

		
		System.out.println("WELCOME TO EMPLOYEE SALARY MAMAGEMENT SYSTEM");
		System.out.println("--------------------------------------------");
		
		System.out.print("Please Enter The Number of Emplooyee you want to check: ");
		int NoE = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 1; i <= NoE; i++) {
			System.out.println("\nEmplooyee "+ i +":");
			
			System.out.print("Please Enter Employee ID: ");
			float ID = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Please Enter Employee Name: ");
			String name = scanner.nextLine();
			
			System.out.print("Please Enter Employee Dempaterment: ");
			String Dep = scanner.nextLine();
			
			System.out.print("Please Enter Employee Basic Salary: ");
			float salary = scanner.nextFloat();
			scanner.nextLine();
			
			float GS = (float) (salary + (salary * 0.2) + (salary * 0.1));
			
			Salary Sal = new Salary(ID, name, Dep, salary, GS);
			Salarys.add(Sal);
		}
		scanner.close();
		
		System.out.print("\n-----Salary List----- ");
		for (int i = 0; i < Salarys.size(); i++) {
			System.out.print("\n\nEmployee " + (i+1) + ": ");
			System.out.println(Salarys.get(i));
		}
	}
}




