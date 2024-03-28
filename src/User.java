public class User {
    private int userId;
    private String username;
    private String password;
    private String email;

    // Parameterized constructor
    public User(int userId, String username, String password, String email) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
    }


    // Getter for userId
    public int getUserId() {
        return this.userId;
    }

    // Setter for userId
    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Getter for username
    public String getUsername() {
        return this.username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for password
    public String getPassword() {
        return this.password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter for email
    public String getEmail() {
        return this.email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }
}
