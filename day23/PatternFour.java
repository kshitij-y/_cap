import java.util.Scanner;

/**
 * Write a regular expression to validate an email ID with the following conditions:
	Username part can contain:
	letters (a–z, A–Z)
	digits (0–9)
	special characters: . _ % + -
	Must contain @
	Domain name should contain only letters
	Extension should contain at least 2 letters
 */

public class PatternFour {
    public static boolean isValidEmail(String mail) {
        return mail.matches("[a-zA-Z0-9._+-]+@[a-z]+\\.[a-z]{2,3}");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String input = sc.next();
        
        String res = isValidEmail(input)? "Valid" : "Invalid";
        System.out.println("Email: " +  res);
    }
}
