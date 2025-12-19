/* 
Write the java program 
q1. to check if the given number is divsible by 7 or not 
q2. to check if the given number is divisible by both 3 and 5 or not
q3. to check if the given charactor is vowel or consonant
q4. to check if the given charactor is digit or not
 */

import java.util.Scanner;

class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Charactor: ");
        char cd = sc.next().charAt(0);

        // Q.4
        if(0 <= cd - '0' && cd - '0' <= 9){
            System.out.println(cd + " is a Digit");
        } else {
            System.out.println(cd + " is a not Digit");
        }
    }
}