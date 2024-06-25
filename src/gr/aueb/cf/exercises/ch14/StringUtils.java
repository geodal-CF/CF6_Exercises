package gr.aueb.cf.exercises.ch14;

public class StringUtils {

    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    public static String toUpperCase(String input) {
        if (input == null) {
            return null;
        }
        return input.toUpperCase();
    }

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String reversed = reverse(input);
        return input.equals(reversed);
    }
}