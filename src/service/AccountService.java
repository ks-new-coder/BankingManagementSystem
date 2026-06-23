package service;

import dao.AccountDAO;
import model.account.Account;

public class AccountService {

    public void createAccount(AccountDAO dao,
                              Account account) {

        dao.save(account);

        System.out.println("Account Created Successfully!");
    }

    public Account getAccount(AccountDAO dao,
                              int accountNumber) {

        return dao.getByAccountNumber(accountNumber);
    }

    public void deposit(Account account,
                        double amount) {

        account.deposit(amount);
    }

    public void withdraw(Account account,
                         double amount) {

        try {

            account.withdraw(amount);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void transfer(Account sender,
                         Account receiver,
                         double amount) {

        sender.transfer(receiver, amount);
    }
}