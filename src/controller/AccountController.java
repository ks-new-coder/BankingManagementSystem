package controller;

import dao.AccountDAO;

import model.account.Account;

import service.AccountService;

public class AccountController {

    private AccountService accountService;

    public AccountController() {

        accountService = new AccountService();
    }

    public void createAccount(AccountDAO dao,
                              Account account) {

        accountService.createAccount(
                dao,
                account
        );
    }

    public Account getAccount(AccountDAO dao,
                              int accountNumber) {

        return accountService.getAccount(
                dao,
                accountNumber
        );
    }

    public void deposit(Account account,
                        double amount) {

        accountService.deposit(
                account,
                amount
        );
    }

    public void withdraw(Account account,
                         double amount) {

        accountService.withdraw(
                account,
                amount
        );
    }

    public void transfer(Account sender,
                         Account receiver,
                         double amount) {

        accountService.transfer(
                sender,
                receiver,
                amount
        );
    }
}