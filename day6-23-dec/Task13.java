 
import java.util.Scanner;

class Task13 {
    public static void fact(int n){
        
        int pro = 1;
        for(int i=1; i <= n; i++){
            pro *= i;
            System.out.println("Fact of " + i +" " + pro);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of a number b/w 1 and n");
        fact(n);
    }
}