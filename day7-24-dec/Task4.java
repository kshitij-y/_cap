/**
 * wajp to find second smallest digit form given number
 */


import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        //Second Smallest digit
        int temp = n;
        int smallest = 10;
        int second_smallest = 10;
        while(temp != 0){
            int digit = temp%10;
            if(digit < smallest){
                second_smallest = smallest;
                smallest = digit;
            } else if ( smallest < digit && digit < second_smallest){
                second_smallest = digit;
            }
            temp /= 10;
        }
        System.out.println("Second Smallest digit: " + second_smallest);
    }
}


