/**
 * wajp to fins largest digit form given number
 */


import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        //largest digit
        int temp = n;
        int largest = 0;
        while(temp != 0){
            int digit = temp%10;
            largest = Math.max(digit, largest);
            temp /= 10;
        }
        System.out.println("Largest digit: " + largest);
    }
}