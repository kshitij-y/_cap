/**
 * all elemnt of array divisible by k
 */
import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int count = 0;

        System.out.print("Enter the array element: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%k == 0) count++;
        }

        System.out.println("Count: " + count);
    }
}