package gr.aueb.cf.exercises.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static void main(String[] args) {

        String pass = "cOding6$";

        Pattern pattern = Pattern.compile("(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#!?@$%^&*-]).{8,}$");
        Matcher matcher = pattern.matcher(pass);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}