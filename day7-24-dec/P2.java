
import java.util.Scanner;

class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;

        
        //Even digits
        System.out.print("Even Digits of the number: ");
        while(temp != 0){
            int digit = temp%10;
            if(digit%2 == 0) System.out.print(digit  + " ");
            temp /= 10;
        }

    }
}