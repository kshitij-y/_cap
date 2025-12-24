
import java.util.Scanner;

/**
 * pallindrone
 */

class Task12 {
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

        System.out.print("Pallindromes: ");
        for(int i=1; i<=n; i++){
            if(isPallindrome(i)) System.out.print(i + " ");
        }
    }
}