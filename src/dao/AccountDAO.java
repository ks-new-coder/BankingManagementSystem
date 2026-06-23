package dao;

import model.account.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountDAO {

    private List<Account> accountList;

    // Constructor

    public AccountDAO() {

        accountList = new ArrayList<>();
    }

    // Save Account

    public void save(Account account) {

        accountList.add(account);

        System.out.println("Account Saved Successfully.");
    }

    // Get Account By Account Number

    public Account getByAccountNumber(int accountNumber) {

        for (Account account : accountList) {

            if (account.getAccountNumber() == accountNumber) {

                return account;
            }
        }

        return null;
    }

    // Get All Accounts

    public List<Account> getAllAccounts() {

        return accountList;
    }

    // Update Account

    public boolean update(Account updatedAccount) {

        for (int i = 0; i < accountList.size(); i++) {

            Account account = accountList.get(i);

            if (account.getAccountNumber()
                    == updatedAccount.getAccountNumber()) {

                accountList.set(i, updatedAccount);

                System.out.println(
                        "Account Updated Successfully."
                );

                return true;
            }
        }

        System.out.println("Account Not Found.");

        return false;
    }

    // Delete Account

    public boolean delete(int accountNumber) {

        Account account =
                getByAccountNumber(accountNumber);

        if (account != null) {

            accountList.remove(account);

            System.out.println(
                    "Account Deleted Successfully."
            );

            return true;
        }

        System.out.println("Account Not Found.");

        return false;
    }

    // Total Accounts

    public int getTotalAccounts() {

        return accountList.size();
    }
}