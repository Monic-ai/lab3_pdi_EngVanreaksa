package lab03;

public class Bank {
    int accNum;
    String cusName;
    float balance;

    public Bank(int accNum, String cusName, float balance) {
        this.accNum = accNum;
        this.cusName = cusName;
        this.balance = balance;
    }

    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(float amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Not enough balance or invalid amount.");
        }
    }

    public int getAccNum() {
        return accNum;
    }

    public String toString() {
        return "Account: " + accNum + ", Name: " + cusName + ", Balance: $" + balance;
    }
}