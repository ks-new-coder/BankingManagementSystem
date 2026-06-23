package view;

import model.account.Account;

import java.util.Scanner;

public class AccountView {

    private Scanner sc;

    // Constructor

    public AccountView() {

        sc = new Scanner(System.in);
    }

    // Read Account Number

    public int getAccountNumber() {

        System.out.print("Enter Account Number : ");

        return sc.nextInt();
    }

    // Read Balance

    public double getInitialBalance() {

        System.out.print("Enter Initial Balance : ");

        return sc.nextDouble();
    }

    // Read Deposit Amount

    public double getDepositAmount() {

        System.out.print("Enter Amount to Deposit : ");

        return sc.nextDouble();
    }

    // Read Withdraw Amount

    public double getWithdrawAmount() {

        System.out.print("Enter Amount to Withdraw : ");

        return sc.nextDouble();
    }

    // Read Transfer Amount

    public double getTransferAmount() {

        System.out.print("Enter Amount to Transfer : ");

        return sc.nextDouble();
    }

    // Display Account Details

    public void displayAccount(Account account) {

        System.out.println("\n================================");

        System.out.println("      ACCOUNT DETAILS");

        System.out.println("================================");

        System.out.println(account);

        System.out.println("================================");
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