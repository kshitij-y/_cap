
import java.util.Scanner;


class Task20 {

    public static boolean isPrime(int n){
        
        if(n == 2) return true;
        if(n%2 == 0) return false;
        for(int i=3; i<=n/2; i = i+2){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static int fact(int n){
        
        int pro = 1;
        for(int i=1; i <= n; i++){
            pro *= i;
        }
        return pro;
    }

    public static int revNum(int n){

        int ans = 0;
        while(n != 0){
            int digit = n%10;
            ans = ans*10 + digit;
            n /= 10;
        }
        return ans;
    }

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

    public static int countPrime(int n){

        int count = 0;
        while(n != 0){
            int digit = n%10;
            if(isPrime(digit)) count++;
            n /= 10;
        }
        return count;
    }

    public static boolean isStrong(int n){

        int temp = n;
        int sum = 0;
        while(temp != 0){
            int digit = temp % 10;
            sum += fact(digit);
            temp /= 10;
        }
        return (sum == n);
    }

    public static void numberReport(int n){

        System.out.println("Rev:\t\t\t" + revNum(n));
        System.out.println("Pallindrome:\t\t" + isPallindrome(n));
        System.out.println("Prime digits count:\t" + countPrime(n));
        System.out.println("Strong number:\t\t" + isStrong(n));
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        numberReport(n);
    }
}