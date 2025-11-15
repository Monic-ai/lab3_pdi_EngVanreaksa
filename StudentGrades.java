package lab03;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Grade> Grades = new ArrayList<> ();

		
		System.out.println("WELCOME TO STUDENT GRADE MAMAGEMENT SYSTEM");
		System.out.println("------------------------------------------");
		
		System.out.print("Please Enter The Number of Student you want to check: ");
		int NoS = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 1; i <= NoS; i++) {
			System.out.println("\nStudent "+ i +":");
			
			System.out.print("Please Enter Student ID: ");
			int ID = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Please Enter Student Name: ");
			String name = scanner.nextLine();
			
			Grade Gra = new Grade( ID, name);

		    for (int j = 1; j <= 5; j++) {
				System.out.print("Please Enter Subject " + j +" Name: ");
				String subname = scanner.nextLine();
				
				float score;
				while (true) {
				    System.out.print("Please Enter Score for " + subname + " (0–100): ");
				    score = scanner.nextFloat();
				    scanner.nextLine();
				    if (score >= 0 && score <= 100) {
				        break;
				    } else {
				        System.out.println("Invalid score. Please enter a value between 0 and 100.");
				    }
				}

					
				Gra.addSubject(new Subject(subname, score));
		    }
		    Grades.add(Gra);
		}
		System.out.print("\n-----Student List----- ");
		for (int k = 0; k < Grades.size(); k++) {
			System.out.print("\n\nStudent " + (k+1) + ": ");
			System.out.println(Grades.get(k));
		}
		
		scanner.close();
	}
}
