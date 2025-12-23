
// to check the given number is prime or not

import java.util.Scanner;


class Task8{
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

        String res = (isPrime(n)) ? "Prime": "Non-prime";
        System.out.print(res);
    }
}