/**
 * special number -> if digit_sum + digit_product == original number
 */


import java.util.Scanner;

class Task6 {
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

        //Special number
        if(isSpecial(n))  System.out.println("Special Number");
        else  System.out.println("Not a special number");
    }
}