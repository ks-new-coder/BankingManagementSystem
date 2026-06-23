package model.account;

import model.customer.Customer;
import model.exception.InsufficientBalanceException;

public abstract class Account implements Transferable {

    private int accountNumber;
    private Customer customer;
    private double balance;

    // Default Constructor
    public Account() {

    }

    // Parameterized Constructor
    public Account(int accountNumber, Customer customer, double balance) {

        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
    }

    // Getters and Setters

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit Method

    public void deposit(double amount) {

        if (amount > 0) {

            balance += amount;

            System.out.println("₹" + amount + " Deposited Successfully.");
            System.out.println("Current Balance : ₹" + balance);

        } else {

            System.out.println("Invalid Deposit Amount.");
        }
    }

    // Withdraw Method

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount <= balance) {

            balance -= amount;

            System.out.println("₹" + amount + " Withdrawn Successfully.");
            System.out.println("Remaining Balance : ₹" + balance);

        } else {

            throw new InsufficientBalanceException(
                    "Insufficient Balance! Available Balance : ₹" + balance
            );
        }
    }

    // Money Transfer

    @Override
    public void transfer(Account receiver, double amount) {

        try {

            this.withdraw(amount);

            receiver.deposit(amount);

            System.out.println("\nTransfer Successful");
            System.out.println("From A/C : " + this.accountNumber);
            System.out.println("To A/C : " + receiver.accountNumber);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
        }
    }

    // Abstract Method
    // SavingsAccount aur CurrentAccount isko override karenge

    public abstract void calculateInterest();

    @Override
    public String toString() {

        return "\nAccount Details" +
                "\n------------------------" +
                "\nAccount Number : " + accountNumber +
                "\nCustomer : " + customer.getName() +
                "\nBalance : ₹" + balance;
    }
}