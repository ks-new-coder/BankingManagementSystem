import controller.AccountController;
import controller.LoginController;

import dao.AccountDAO;
import dao.UserDAO;

import model.account.Account;
import model.account.CurrentAccount;
import model.account.SavingsAccount;

import model.auth.User;
import model.customer.Customer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LoginController loginController =
                new LoginController();

        AccountController accountController =
                new AccountController();

        UserDAO userDAO = new UserDAO();

        AccountDAO accountDAO =
                new AccountDAO();

        boolean loggedIn = false;

        int choice;

        do {

            System.out.println("\n================================");

            System.out.println(" BANKING MANAGEMENT SYSTEM ");

            System.out.println("================================");

            System.out.println("1. Register");

            System.out.println("2. Login");

            System.out.println("3. Create Savings Account");

            System.out.println("4. Create Current Account");

            System.out.println("5. Deposit");

            System.out.println("6. Withdraw");

            System.out.println("7. Transfer");

            System.out.println("8. Show Account Details");

            System.out.println("9. Show All Accounts");

            System.out.println("10. Logout");

            System.out.println("11. Exit");

            System.out.print("\nEnter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print(
                            "Enter Username : ");

                    String username =
                            sc.nextLine();

                    System.out.print(
                            "Enter Password : ");

                    String password =
                            sc.nextLine();

                    System.out.print(
                            "Enter Role : ");

                    String role =
                            sc.nextLine();

                    User user =
                            new User(
                                    username,
                                    password,
                                    role
                            );

                    loginController.register(
                            userDAO,
                            user
                    );

                    break;

                case 2:

                    sc.nextLine();

                    System.out.print(
                            "Enter Username : ");

                    username =
                            sc.nextLine();

                    System.out.print(
                            "Enter Password : ");

                    password =
                            sc.nextLine();

                    loggedIn =
                            loginController.login(
                                    userDAO,
                                    username,
                                    password
                            );

                    break;

                case 3:

                    if (!loggedIn) {

                        System.out.println(
                                "Please Login First."
                        );

                        break;
                    }

                    sc.nextLine();

                    System.out.print(
                            "Customer ID : ");

                    int cid =
                            sc.nextInt();

                    sc.nextLine();

                    System.out.print(
                            "Customer Name : ");

                    String name =
                            sc.nextLine();

                    System.out.print(
                            "Email : ");

                    String email =
                            sc.nextLine();

                    System.out.print(
                            "Phone : ");

                    String phone =
                            sc.nextLine();

                    System.out.print(
                            "Address : ");

                    String address =
                            sc.nextLine();

                    Customer customer =
                            new Customer(
                                    cid,
                                    name,
                                    email,
                                    phone,
                                    address
                            );

                    System.out.print(
                            "Account Number : ");

                    int accNo =
                            sc.nextInt();

                    System.out.print(
                            "Initial Balance : ");

                    double balance =
                            sc.nextDouble();

                    System.out.print(
                            "Interest Rate : ");

                    double rate =
                            sc.nextDouble();

                    Account savings =
                            new SavingsAccount(
                                    accNo,
                                    customer,
                                    balance,
                                    rate
                            );

                    accountController
                            .createAccount(
                                    accountDAO,
                                    savings
                            );

                    break;

                case 4:

                    if (!loggedIn) {

                        System.out.println(
                                "Please Login First."
                        );

                        break;
                    }

                    sc.nextLine();

                    System.out.print(
                            "Customer ID : ");

                    cid = sc.nextInt();

                    sc.nextLine();

                    System.out.print(
                            "Customer Name : ");

                    name =
                            sc.nextLine();

                    System.out.print(
                            "Email : ");

                    email =
                            sc.nextLine();

                    System.out.print(
                            "Phone : ");

                    phone =
                            sc.nextLine();

                    System.out.print(
                            "Address : ");

                    address =
                            sc.nextLine();

                    customer =
                            new Customer(
                                    cid,
                                    name,
                                    email,
                                    phone,
                                    address
                            );

                    System.out.print(
                            "Account Number : ");

                    accNo =
                            sc.nextInt();

                    System.out.print(
                            "Initial Balance : ");

                    balance =
                            sc.nextDouble();

                    System.out.print(
                            "Overdraft Limit : ");

                    double limit =
                            sc.nextDouble();

                    Account current =
                            new CurrentAccount(
                                    accNo,
                                    customer,
                                    balance,
                                    limit
                            );

                    accountController
                            .createAccount(
                                    accountDAO,
                                    current
                            );

                    break;

                case 5:

                    System.out.print(
                            "Account Number : ");

                    accNo =
                            sc.nextInt();

                    Account acc =
                            accountController
                                    .getAccount(
                                            accountDAO,
                                            accNo
                                    );

                    if (acc != null) {

                        System.out.print(
                                "Amount : ");

                        double amount =
                                sc.nextDouble();

                        accountController
                                .deposit(
                                        acc,
                                        amount
                                );

                    } else {

                        System.out.println(
                                "Account Not Found."
                        );
                    }

                    break;

                case 6:

                    System.out.print(
                            "Account Number : ");

                    accNo =
                            sc.nextInt();

                    acc =
                            accountController
                                    .getAccount(
                                            accountDAO,
                                            accNo
                                    );

                    if (acc != null) {

                        System.out.print(
                                "Amount : ");

                        double amount =
                                sc.nextDouble();

                        accountController
                                .withdraw(
                                        acc,
                                        amount
                                );

                    } else {

                        System.out.println(
                                "Account Not Found."
                        );
                    }

                    break;

                case 7:

                    System.out.print(
                            "Sender Account : ");

                    int senderNo =
                            sc.nextInt();

                    System.out.print(
                            "Receiver Account : ");

                    int receiverNo =
                            sc.nextInt();

                    Account sender =
                            accountController
                                    .getAccount(
                                            accountDAO,
                                            senderNo
                                    );

                    Account receiver =
                            accountController
                                    .getAccount(
                                            accountDAO,
                                            receiverNo
                                    );

                    if (sender != null
                            && receiver != null) {

                        System.out.print(
                                "Amount : ");

                        double amount =
                                sc.nextDouble();

                        accountController
                                .transfer(
                                        sender,
                                        receiver,
                                        amount
                                );

                    } else {

                        System.out.println(
                                "Invalid Account Number."
                        );
                    }

                    break;

                case 8:

                    System.out.print(
                            "Account Number : ");

                    accNo =
                            sc.nextInt();

                    acc =
                            accountController
                                    .getAccount(
                                            accountDAO,
                                            accNo
                                    );

                    if (acc != null) {

                        System.out.println(acc);

                    } else {

                        System.out.println(
                                "Account Not Found."
                        );
                    }

                    break;

                case 9:

                    for (Account a :
                            accountDAO.getAllAccounts()) {

                        System.out.println(a);

                        System.out.println(
                                "----------------------");
                    }

                    break;

                case 10:

                    loggedIn = false;

                    System.out.println(
                            "Logged Out Successfully."
                    );

                    break;

                case 11:

                    System.out.println(
                            "Thank You!"
                    );

                    break;

                default:

                    System.out.println(
                            "Invalid Choice."
                    );
            }

        } while (choice != 11);

        sc.close();
    }
}