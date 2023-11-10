package JavaCodingTasks;

import java.util.regex.Pattern;

public class PasswordValidationTaskEmre {

    public static boolean isValidPassword(String password) {
        // 1. Password MUST be at least have 6 characters and should not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Check for at least one uppercase letter
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            return false;
        }

        // Check for at least one lowercase letter
        if (!Pattern.compile("[a-z]").matcher(password).find()) {
            return false;
        }

        // Check for at least one special character (you can customize the special characters as needed)
        if (!Pattern.compile("[!@#$%^&*()_+=-]").matcher(password).find()) {
            return false;
        }

        // 5. Password should at least contain a digit
        if (!Pattern.compile("\\d").matcher(password).find()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String password = "Password123!";
        if (isValidPassword(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is not valid");
        }
    }
}
