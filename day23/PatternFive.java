// Write a regular expression to validate a password with the following rules:
// 	Minimum 8 characters
// 	Must contain at least one uppercase letter
// 	Must contain at least one digit 

import java.util.Scanner;

public class PatternFive {
    public  static boolean isValidPass(String s) {
        return s.matches("(?=.+[A-Z])(?=.+[a-z]).{8,}");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String input = sc.next();
        
        String res = isValidPass(input)? "Valid" : "Invalid";
        System.out.println("Mobile number: " +  res);
    }
}

