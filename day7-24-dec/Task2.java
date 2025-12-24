/**
 * wajp to fins smallest digit form given number
 */


import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        //Smallest digit
        int temp = n;
        int smallest = 10;
        while(temp != 0){
            int digit = temp%10;
            smallest = Math.min(digit, smallest);
            temp /= 10;
        }
        System.out.println("Smallest digit: " + smallest);
    }
}