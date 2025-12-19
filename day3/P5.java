/* 
Write the java program 
q1. to check if the given number is divsible by 7 or not 
q2. to check if the given number is divisible by both 3 and 5 or not
q3. to check if the given charactor is vowel or consonant
q4. to check if the given charactor is digit or not
 */

import java.util.Scanner;

class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Q.2
        if(n%3 == 0 && n%5 == 0){
            System.out.println("Divisible by both 3 and 5: True");
        } else {
            System.out.println("Divisible by both 3 and 5: False");
        }

    }
}