package view;

import java.util.Scanner;

public class LoginView {

    private Scanner sc;

    // Constructor

    public LoginView() {

        sc = new Scanner(System.in);
    }

    // Read Username

    public String getUsername() {

        System.out.print("Enter Username : ");

        return sc.nextLine();
    }

    // Read Password

    public String getPassword() {

        System.out.print("Enter Password : ");

        return sc.nextLine();
    }

    // Login Success Message

    public void showLoginSuccess() {

        System.out.println("\n================================");
        System.out.println("Login Successful!");
        System.out.println("================================");
    }

    // Login Failed Message

    public void showLoginFailure() {

        System.out.println("\n================================");
        System.out.println("Invalid Username or Password!");
        System.out.println("================================");
    }

    // Welcome Message

    public void showWelcome() {

        System.out.println("\n================================");
        System.out.println("   BANKING MANAGEMENT SYSTEM");
        System.out.println("================================");
    }

    // Exit Message

    public void showExitMessage() {

        System.out.println("\nThank You For Using Banking System.");
    }
}