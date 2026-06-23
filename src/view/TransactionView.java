package view;

import model.transaction.Transaction;

import java.util.List;
import java.util.Scanner;

public class TransactionView {

    private Scanner sc;

    // Constructor

    public TransactionView() {

        sc = new Scanner(System.in);
    }

    // Read Transaction ID

    public int getTransactionId() {

        System.out.print("Enter Transaction ID : ");

        return sc.nextInt();
    }

    // Read Transaction Type

    public String getTransactionType() {

        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter Transaction Type (Deposit/Withdraw/Transfer) : ");

        return sc.nextLine();
    }

    // Read Transaction Amount

    public double getAmount() {

        System.out.print("Enter Amount : ");

        return sc.nextDouble();
    }

    // Display Single Transaction

    public void displayTransaction(Transaction transaction) {

        if (transaction == null) {

            System.out.println("\nTransaction Not Found.");

            return;
        }

        System.out.println("\n================================");

        System.out.println("     TRANSACTION DETAILS");

        System.out.println("================================");

        System.out.println(transaction);

        System.out.println("================================");
    }

    // Display Transaction History

    public void displayTransactions(List<Transaction> transactions) {

        if (transactions == null || transactions.isEmpty()) {

            System.out.println("\nNo Transactions Found.");

            return;
        }

        System.out.println("\n========== TRANSACTION HISTORY ==========");

        for (Transaction transaction : transactions) {

            System.out.println(transaction);

            System.out.println("-----------------------------------------");
        }
    }

    // Success Message

    public void showSuccess(String message) {

        System.out.println("\nSUCCESS : " + message);
    }

    // Error Message

    public void showError(String message) {

        System.out.println("\nERROR : " + message);
    }
}