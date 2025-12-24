
import java.util.Scanner;

/**
 * pallindrone
 */

class Task11 {
    public static boolean isPallindrome(int n){
        int rev = 0;
        int ori = n;
        while(n != 0){
            int digit = n%10;
            rev = rev*10 + digit;
            n /= 10;
        }
        return rev == ori;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(isPallindrome(n)) System.out.println(n + " is a Pallindrome number.");
        else System.out.println(n + " is not a Pallindrome number.");
    }
}