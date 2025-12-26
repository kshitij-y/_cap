/**
 * Abundant number
 * sum of proper factors > original
 */
import java.util.Scanner;

class Task14 {
    public static boolean isAbundant(int n){
        int sum = 0;
        for(int i=2; i <= n/2; i++){
            if(n%i == 0) sum += i;
        }
        return sum > n;
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        /**
         * System.out.print("Abundant numbers: ");
         * for(int i=0; i<=n; i++) {
         *  if(isAbundant(i)) System.out.print( i + " ");
         * }
         */

        if(isAbundant(n)) System.out.println("Abundant number");
        else System.out.println("Not an abundant number");
    }
}