import java.util.Scanner;

public class PasswordStrengthChecker {

    public static String checkStrength(String password) {
        int strength = 0;

        if (password.length() >= 8) strength++;
        if (password.matches(".*[A-Z].*")) strength++;
        if (password.matches(".*[a-z].*")) strength++;
        if (password.matches(".*\\d.*")) strength++;
        if (password.matches(".*[!@#$%^&*()].*")) strength++;

        if (strength <= 2)
            return "Weak Password ";
        else if (strength == 3 || strength == 4)
            return "Medium Password ";
        else
            return "Strong Password ";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        System.out.println("Result: " + checkStrength(password));
    }
}
