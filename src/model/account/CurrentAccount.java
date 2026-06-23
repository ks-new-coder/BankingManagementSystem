package model.account;

import model.customer.Customer;
import model.exception.InsufficientBalanceException;

public class CurrentAccount extends Account {

    private double overdraftLimit;

    // Default Constructor
    public CurrentAccount() {

    }

    // Parameterized Constructor
    public CurrentAccount(int accountNumber,
                          Customer customer,
                          double balance,
                          double overdraftLimit) {

        super(accountNumber, customer, balance);

        this.overdraftLimit = overdraftLimit;
    }

    // Getter and Setter

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // Method Overriding

    @Override
    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount <= (getBalance() + overdraftLimit)) {

            setBalance(getBalance() - amount);

            System.out.println("₹" + amount
                    + " Withdrawn Successfully.");

            System.out.println("Current Balance : ₹"
                    + getBalance());

        } else {

            throw new InsufficientBalanceException(
                    "Withdrawal exceeds Overdraft Limit!"
            );
        }
    }

    // Method Overriding

    @Override
    public void calculateInterest() {

        System.out.println(
                "Current Account does not provide Interest."
        );
    }

    @Override
    public String toString() {

        return super.toString()
                + "\nAccount Type : Current Account"
                + "\nOverdraft Limit : ₹"
                + overdraftLimit;
    }
}