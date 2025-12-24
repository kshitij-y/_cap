
import java.util.Scanner;

class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        //Sum of digits
        int temp = n;
        int sum = 0;
        System.out.print("Sum Digits of the number: ");
        while(temp != 0){
            int digit = temp%10;
            sum += digit;
            temp /= 10;
        }
        System.out.print(sum);
    }
}