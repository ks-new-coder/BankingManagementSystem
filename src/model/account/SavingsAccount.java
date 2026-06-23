package model.account;

import model.customer.Customer;

public class SavingsAccount extends Account {

    private double interestRate;

    // Default Constructor
    public SavingsAccount() {

    }

    // Parameterized Constructor
    public SavingsAccount(int accountNumber,
                          Customer customer,
                          double balance,
                          double interestRate) {

        super(accountNumber, customer, balance);

        this.interestRate = interestRate;
    }

    // Getter and Setter

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Method Overriding

    @Override
    public void calculateInterest() {

        double interest =
                (getBalance() * interestRate) / 100;

        System.out.println("Interest Rate : "
                + interestRate + "%");

        System.out.println("Interest Amount : ₹"
                + interest);

        System.out.println("Balance After Interest : ₹"
                + (getBalance() + interest));
    }

    @Override
    public String toString() {

        return super.toString()
                + "\nAccount Type : Savings Account"
                + "\nInterest Rate : "
                + interestRate + "%";
    }
}