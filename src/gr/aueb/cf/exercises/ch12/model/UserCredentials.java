package gr.aueb.cf.exercises.ch12.model;

public class UserCredentials {
    private Long id;
    private String username;
    private String password;

    // Default constructor
    public UserCredentials() {
    }

    // Overloaded constructor
    public UserCredentials(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}