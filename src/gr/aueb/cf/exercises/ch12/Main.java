package gr.aueb.cf.exercises.ch12;

import gr.aueb.cf.exercises.ch12.model.User;
import gr.aueb.cf.exercises.ch12.model.UserCredentials;

public class Main {
    public static void main(String[] args) {
        // Δημιουργία instance της κλάσης User χρησιμοποιώντας τον overloaded constructor
        User user = new User(1L, "Jake", "Paul");

        // Δημιουργία instance της κλάσης UserCredentials χρησιμοποιώντας τον overloaded constructor
        UserCredentials userCredentials = new UserCredentials(1L, "jakepaul", "pass123");

        // Εμφάνιση όλων των πεδίων του instance της κλάσης User
        System.out.println("User: {id: " + user.getId() + ", firstname: " + user.getFirstname() + ", lastname: " + user.getLastname() + "}");

        // Εμφάνιση όλων των πεδίων του instance της κλάσης UserCredentials
        System.out.println("UserCredentials: {id: " + userCredentials.getId() + ", username: " + userCredentials.getUsername() + ", password: " + userCredentials.getPassword() + "}");
    }
}