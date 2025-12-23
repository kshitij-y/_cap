
import java.util.Scanner;

// wajp prime number in range

class Task9 {

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

        int count = 0;
        System.out.print("Prime number in [2," + n + "]: ");
        for(int i = 2; i<= n; i++){
            if(isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.print("\nTotal number of primes: " + count);
        
    }
}