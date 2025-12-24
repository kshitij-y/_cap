
import java.util.Scanner;

class Task11 {
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

        System.out.print("Prefect numbers: ");
        for(int i=1; i<= n; i++){
            if(isPerfect(i)){
                System.out.print(i + " ");
            }
        }
    }
}