package service;

import dao.UserDAO;
import model.auth.User;

public class LoginService {

    public boolean login(UserDAO userDAO,
                         String username,
                         String password) {

        User user = userDAO.getByUsername(username);

        if (user == null) {

            System.out.println("User Not Found.");

            return false;
        }

        if (user.getPassword().equals(password)) {

            System.out.println("Login Successful!");

            return true;
        }

        System.out.println("Invalid Password!");

        return false;
    }

    public void register(UserDAO userDAO,
                         User user) {

        userDAO.save(user);

        System.out.println("Registration Successful!");
    }
}