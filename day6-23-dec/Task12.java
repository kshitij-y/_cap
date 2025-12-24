
import java.util.Scanner;

class Task12 {
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
        while(n < 0) {
            System.out.print("Enter Positive: ");
            n = sc.nextInt();
        }
        System.out.print("Factorial: " + fact(n));
    }
}