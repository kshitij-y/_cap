
import java.util.Scanner;
/**
 * Product of sum of Odd digits and Even digits
 */
class Task1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input(int): ");
        int n = sc.nextInt();
        int temp = n;

        int even_sum = 0;
        int odd_sum = 0;
        while(temp != 0){
            int digit = temp%10;

            if(digit%2 == 0) even_sum += digit;
            else odd_sum += digit;

            temp /= 10;
        }
        System.out.print("Output: " + odd_sum*even_sum);

    }
}