package model.auth;

public class User {

    private String username;
    private String password;
    private String role;

    // Default Constructor
    public User() {

    }

    // Parameterized Constructor
    public User(String username, String password, String role) {

        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters and Setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Login Validation

    public boolean validateLogin(String username, String password) {

        return this.username.equals(username)
                && this.password.equals(password);
    }

    @Override
    public String toString() {

        return "User Details\n" +
                "-----------------\n" +
                "Username : " + username +
                "\nRole : " + role;
    }
}