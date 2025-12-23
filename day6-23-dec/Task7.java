
import java.util.Scanner;

class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Facter: ");
        for(int i=1; i<= n/2; i++){
            if(n%i == 0)System.out.print(i + " ");
        }
        System.out.print(n + "\n");
    }
}