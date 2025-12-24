
import java.util.Scanner;

class Task8 {
    public static int sumOfDigit(int n){
        int sum = 0;
        while(n !=0 ){
            sum += (n%10);
            n /= 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int digit_sum = sumOfDigit(n);

        if(n % digit_sum == 0) {
            System.out.println("Niven  number");
        } else System.out.println("Not a niven muber");
    }
}