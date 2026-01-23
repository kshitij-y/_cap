import java.util.Scanner;

/**
 * Write a regular expression to validate a username with these rules:
	Must start with a letter
	Can contain letters, digits, and underscore (_)
	Length should be between 5 and 15 characters
 */
public class PatternSix {
    public static boolean isValidUsername(String input) {
        return input.matches("[A-Z]+(?=.*\\d)(?=.*[a-zA-z]_).{5,15}");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String input = sc.next();
        
        String res = isValidUsername(input)? "Valid" : "Invalid";
        System.out.println("Mobile number: " +  res);
        sc.close();
    }
    
}
