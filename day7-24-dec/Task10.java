
import java.util.Scanner;
/**
 * Strong number -> sum of fact of each digit == original
 */
class Task10{
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

        int temp = n;
        int sum = 0;
        while(temp != 0){
            int digit = temp % 10;
            sum += fact(digit);
            temp /= 10;
        }

        if(sum == n) System.out.println("Number is strong");
        else System.out.println("Number is not strong");
    }
}
