
import java.util.Scanner;

class Task10 {
    public static boolean isPerfect(int n){
        int sum = 0;
        for(int i=1; i <= n/2; i++){
            if(n%i == 0){
                sum += i;
                if(sum > n){
                    return false;
                }
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(isPerfect(n)) System.out.println("Perfect number");
        else System.out.println("Not a perfect number");
    }
}