package model.exception;

public class InsufficientBalanceException extends Exception {

    private static final long serialVersionUID = 1L;

    // Default Constructor
    public InsufficientBalanceException() {

        super("Insufficient Balance!");
    }

    // Parameterized Constructor
    public InsufficientBalanceException(String message) {

        super(message);
    }
}