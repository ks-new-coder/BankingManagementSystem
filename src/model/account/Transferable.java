package model.account;

public interface Transferable {

    void transfer(Account receiver, double amount);
}