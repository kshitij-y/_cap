/**
 * return the element of the array
 * input -> {123, 456, 789}
 * output -> {321, 654, 987}
 */
import java.util.Scanner;

class Task14 {
    public static int revNum(int num){
        int ans = 0;
    
        while(num!= 0) {
            int digit = num%10;
            ans = ans*10 + digit;
            num /= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];


        System.out.print("Enter the array element: ");
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            int rev = revNum(num);
            arr[i] = rev;
        }

        System.out.print("Output: ");

        for(int x:arr){
            System.out.print(x + " ");
        }

    }

}