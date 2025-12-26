
import java.util.Scanner;

class Task19 {
    public static boolean isInFibonacci(int n){
        if(n == 0 || n == 1) return true;
        int a = 0;
        int b = 1;
        int c = 1;
        while(c <= n) {
            c = a+b;
            if(c == n) return true;
            else {
                a = b;
                b = c;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if(isInFibonacci(n)) System.out.println("Present in fibonacci");
        else System.out.println("Not present in fibonacci");

    }
}