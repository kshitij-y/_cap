
import java.util.Scanner;



class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Q.1
        if(n%7 == 0){
            System.out.println("Divisible by 7: True");
        } else {
            System.out.println("Divisible by 7: False");
        }
    }
}