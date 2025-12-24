import java.util.Scanner;
/**
 * fibonacci series
 */
class Task18 {

    /**
     * Print first n fibonacci sequence
     */
    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.print("0 1 ");
        int c = 1;
        while(n-2 > 0){
            c = a+b;
            System.out.print(c+ " ");
            a = b;
            b = c;
            n--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n(int): ");
        int n = sc.nextInt();
        
        System.out.print("First n fibonacci sequence: ");
        fibonacci(n);
    }
}