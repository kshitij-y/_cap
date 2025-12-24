
import java.util.Scanner;

class P3 {
    public static boolean isPrime(int n){
        if(n == 2) return true;
        if(n%2 == 0) return false;
        for(int i=3; i<=n/2; i = i+2){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;


        //prime digits
        System.out.print("Prime Digits of the number: ");
        while(temp != 0){
            int digit = temp%10;
            if(isPrime(digit)) System.out.print(digit  + " ");
            temp /= 10;
        }

    }
}