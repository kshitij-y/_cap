
import java.util.Scanner;

class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;

        //digits
        System.out.print("Digits of the number: ");
        while(temp != 0){
            System.out.print( temp%10 + " ");
            temp /= 10;
        }
    }
}