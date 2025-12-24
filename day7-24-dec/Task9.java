
import java.util.Scanner;
/**
 * factorial of digits of a number
 */
class Task9{
    public static int fact(int n){
        
        int pro = 1;
        for(int i=1; i <= n; i++){
            pro *= i;
        }
        return pro;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        System.out.print("Factorial of digits: ");
        while(temp != 0){
            int digit = temp%10;
            System.out.print(fact(digit) + " ");
            temp /= 10;
        }
    }
}