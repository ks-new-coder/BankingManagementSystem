package model.transaction;

import java.time.LocalDateTime;

public class Transaction {

    private int transactionId;
    private String transactionType;
    private double amount;
    private LocalDateTime transactionDate;

    // Default Constructor
    public Transaction() {

    }

    // Parameterized Constructor
    public Transaction(int transactionId,
                       String transactionType,
                       double amount,
                       LocalDateTime transactionDate) {

        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    // Getters and Setters

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    // toString()

    @Override
    public String toString() {

        return "\nTransaction Details"
                + "\n--------------------------"
                + "\nTransaction ID : " + transactionId
                + "\nType : " + transactionType
                + "\nAmount : ₹" + amount
                + "\nDate & Time : " + transactionDate;
    }
}