/**
 * print the average of all smallest and all largest
 */
import java.util.Scanner;


class Task11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int smallest_count = 0;
        int largest_count = 0;

        System.out.print("Enter the array element: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            smallest = Math.min(smallest, arr[i]);
            largest = Math.max(largest, arr[i]);
        }

        for(int x:arr){
            if(x == smallest) smallest_count++;
            if(x == largest) largest_count++;
        }

        // System.out.println(smallest + " " + largest);

        if(smallest == largest) {
            System.out.println("Avg: " + smallest);
        } else {
            double ans = (double)((smallest * smallest_count) + (largest * largest_count)) / (smallest_count + largest_count);
            System.out.println("Avg: " + ans);
        }


    }
}
