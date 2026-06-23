package controller;

import model.transaction.Transaction;
import service.TransactionService;

public class TransactionController {

    private TransactionService transactionService;

    // Constructor

    public TransactionController() {

        transactionService = new TransactionService();
    }

    // Add Transaction

    public void addTransaction(Transaction transaction) {

        transactionService.addTransaction(transaction);
    }

    // Display All Transactions

    public void displayTransactions() {

        transactionService.displayTransactions();
    }

    // Search Transaction by ID

    public Transaction searchTransaction(int transactionId) {

        return transactionService.searchTransaction(transactionId);
    }

    // Delete Transaction

    public boolean deleteTransaction(int transactionId) {

        return transactionService.deleteTransaction(transactionId);
    }

    // Total Transactions

    public int getTotalTransactions() {

        return transactionService.getTotalTransactions();
    }
}