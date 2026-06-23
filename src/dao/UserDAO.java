package dao;

import model.auth.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private List<User> userList;

    // Constructor

    public UserDAO() {

        userList = new ArrayList<>();
    }

    // Save User

    public void save(User user) {

        userList.add(user);

        System.out.println("User Saved Successfully.");
    }

    // Get User By Username

    public User getByUsername(String username) {

        for (User user : userList) {

            if (user.getUsername().equals(username)) {

                return user;
            }
        }

        return null;
    }

    // Get All Users

    public List<User> getAllUsers() {

        return userList;
    }

    // Delete User

    public boolean delete(String username) {

        User user = getByUsername(username);

        if (user != null) {

            userList.remove(user);

            System.out.println(
                    "User Deleted Successfully."
            );

            return true;
        }

        System.out.println("User Not Found.");

        return false;
    }

    // Total Users

    public int getTotalUsers() {

        return userList.size();
    }
}