/**
 * wajp to find second largest digit form given number
 */


import java.util.Scanner;

class Task5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        //Second largest digit
        int temp = n;
        int largest = 0;
        int second_largest = 0;
        while(temp != 0){
            int digit = temp%10;
            
            if(largest < digit) {
                second_largest = largest;
                largest = digit;
            } else if(second_largest < digit && digit < largest) {
                second_largest = digit;
            }

            temp /= 10;
        }
        System.out.println("Second Largest digit: " + second_largest);
    }
}