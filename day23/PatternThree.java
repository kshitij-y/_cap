
import java.util.Scanner;

/**
 * Q1. Write a regular expression to validate a mobile number with the following rules:
 * Must start with 6, 7, 8, or 9
 * Must contain exactly 10 digits
 */
public class PatternThree {
    public static boolean isMobileNumber(String s){
        return s.matches("^[6|7|8|9][0-9]{9}$");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        String input = sc.next();
        
        String res = isMobileNumber(input)? "Valid" : "Invalid";
        System.out.println("Mobile number: " +  res);
    }
}
