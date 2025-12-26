
import java.util.Scanner;
/**
 * Xylem and Phloem number
 */

class Task15{
    public static boolean isXylemPhloem(int n) {
        int innerSum = 0;
        int outerSum = 0;
        int temp = n;

        while(temp != 0) {
            int digit = temp%10;
            if(temp == n || temp < 10) outerSum += digit;
            else innerSum += digit;

            temp /= 10;
        }

        return innerSum == outerSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(isXylemPhloem(n))System.out.println(n + " -> Xylem number");
        else System.out.println(n +  " -> Phloem number");

    }
}