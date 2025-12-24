/**
 * special number -> if digit_sum + digit_product == original number
 * special number in range [1,n]
 */


import java.util.Scanner;

class Task7 {
    public static boolean  isSpecial(int n) {
        int temp = n;
        int digit_sum = 0;
        int digit_product = 1;
        while(temp != 0){
            int digit = temp%10;
            
            digit_sum += digit;
            digit_product *= digit;

            temp /= 10;
        }
        return (digit_sum + digit_product == n);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Special Numbers: ");
        for(int i=1; i<=n; i++){
            if(isSpecial(i)) System.out.print(i + " ");
        }
    }
}