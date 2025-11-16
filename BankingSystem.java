package lab03;

import java.util.ArrayList;
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Bank> bankList = new ArrayList<>();

        System.out.println("Welcome to Bank Management System");
        System.out.println("----------------------------------");

        System.out.print("Enter number of customers: ");
        int numCus = input.nextInt();
        input.nextLine();

        float totalBalance = 0;

        for (int i = 1; i <= numCus; i++) {
            System.out.println("\nCustomer " + i + ":");

            System.out.print("Enter Account Number: ");
            int acc = input.nextInt();
            input.nextLine();

            System.out.print("Enter Customer Name: ");
            String name = input.nextLine();

            System.out.print("Enter Initial Balance: ");
            float bal = input.nextFloat();

            Bank b = new Bank(acc, name, bal);
            bankList.add(b);
            totalBalance += bal;
        }

        char more;
        do {
            System.out.print("\nEnter Account Number to access: ");
            int accSearch = input.nextInt();

            Bank found = null;
            for (Bank b : bankList) {
                if (b.getAccNum() == accSearch) {
                    found = b;
                    break;
                }
            }

            if (found != null) {
                System.out.print("Enter D to Deposit or W to Withdraw: ");
                char action = input.next().toUpperCase().charAt(0);

                System.out.print("Enter amount: ");
                float amt = input.nextFloat();

                if (action == 'D') {
                    found.deposit(amt);
                } else if (action == 'W') {
                    found.withdraw(amt);
                } else {
                    System.out.println("Invalid action.");
                }
            } else {
                System.out.println("Account not found.");
            }

            System.out.print("Do you want another transaction? (Y/N): ");
            more = input.next().toUpperCase().charAt(0);

        } while (more == 'Y');

        System.out.println("\n----- Final Account Details -----");
        for (int i = 0; i < bankList.size(); i++) {
            System.out.println("Customer " + (i + 1) + ": " + bankList.get(i));
        }

        System.out.println("\nTotal Balance of All Customers: $" + totalBalance);

        input.close();
    }
}