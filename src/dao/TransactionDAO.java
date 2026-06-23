package dao;

import model.transaction.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionDAO {

    private List<Transaction> transactionList;

    // Constructor

    public TransactionDAO() {

        transactionList = new ArrayList<>();
    }

    // Save Transaction

    public void save(Transaction transaction) {

        transactionList.add(transaction);

        System.out.println("Transaction Saved Successfully.");
    }

    // Get Transaction By ID

    public Transaction getById(int transactionId) {

        for (Transaction transaction : transactionList) {

            if (transaction.getTransactionId() == transactionId) {

                return transaction;
            }
        }

        return null;
    }

    // Get All Transactions

    public List<Transaction> getAllTransactions() {

        return transactionList;
    }

    // Delete Transaction

    public boolean delete(int transactionId) {

        Transaction transaction = getById(transactionId);

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

    // Total Transactions

    public int getTotalTransactions() {

        return transactionList.size();
    }
}