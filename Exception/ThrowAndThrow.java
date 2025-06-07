import java.util.*;

// Custom exception class
class Insufficient_Balaence_Exception extends Exception {
    Insufficient_Balaence_Exception(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance = 20000;

    // Method to withdraw money
    void withdraw(double amt) throws Insufficient_Balaence_Exception {
        if (amt > balance) {
            throw new Insufficient_Balaence_Exception("Insufficient Balance");
        } else {
            balance = balance - amt;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to take user input
        BankAccount b1 = new BankAccount();

        System.out.print("Enter the amount to withdraw: ");
        double amount = sc.nextDouble(); // Take input for withdrawal amount

        try {
            b1.withdraw(amount); // Attempt to withdraw the entered amount
        } catch (Insufficient_Balaence_Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            sc.close(); // Close the Scanner to release resources
        }
    }
}