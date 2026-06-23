package controller;

import dao.UserDAO;
import model.auth.User;
import service.LoginService;

public class LoginController {

    private LoginService loginService;

    public LoginController() {

        loginService = new LoginService();
    }

    public void register(UserDAO userDAO,
                         User user) {

        loginService.register(userDAO, user);
    }

    public boolean login(UserDAO userDAO,
                         String username,
                         String password) {

        return loginService.login(
                userDAO,
                username,
                password
        );
    }
}