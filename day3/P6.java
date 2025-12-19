/* 
Write the java program 
q1. to check if the given number is divsible by 7 or not 
q2. to check if the given number is divisible by both 3 and 5 or not
q3. to check if the given charactor is vowel or consonant
q4. to check if the given charactor is digit or not
 */

import java.util.Scanner;

class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Charactor: ");
        char ch = sc.next().charAt(0);


        // Q.3
        if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println(ch + " is a Consonant");
        }

    }
}