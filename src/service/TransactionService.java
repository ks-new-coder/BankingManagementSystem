package service;

import model.transaction.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {

    // Transaction History List

    private List<Transaction> transactionList;

    // Constructor

    public TransactionService() {

        transactionList = new ArrayList<>();
    }

    // Add Transaction

    public void addTransaction(Transaction transaction) {

        transactionList.add(transaction);

        System.out.println("Transaction Added Successfully!");
    }

    // Display All Transactions

    public void displayTransactions() {

        if (transactionList.isEmpty()) {

            System.out.println("No Transactions Found.");

            return;
        }

        System.out.println("\n===== Transaction History =====");

        for (Transaction transaction : transactionList) {

            System.out.println(transaction);

            System.out.println("----------------------------");
        }
    }

    // Search Transaction by ID

    public Transaction searchTransaction(int transactionId) {

        for (Transaction transaction : transactionList) {

            if (transaction.getTransactionId()
                    == transactionId) {

                return transaction;
            }
        }

        return null;
    }

    // Get Total Transactions

    public int getTotalTransactions() {

        return transactionList.size();
    }

    // Delete Transaction

    public boolean deleteTransaction(int transactionId) {

        Transaction transaction =
                searchTransaction(transactionId);

        if (transaction != null) {

            transactionList.remove(transaction);

            System.out.println(
                    "Transaction Deleted Successfully."
            );

            return true;
        }

        System.out.println("Transaction Not Found.");

        return false;
    }

    // Getter

    public List<Transaction> getTransactionList() {

        return transactionList;
    }
}