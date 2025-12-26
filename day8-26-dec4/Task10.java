
/**
 * array sum
 */
import java.util.Scanner;


class Task10 {

    public static int arraySum(int[] arr){
        int sum = 0;
        for(int x:arr) sum += x;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the array element: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = arraySum(arr);
        int avg = sum/n;

        int count = 0;

        for(int x:arr){
            if(avg == x) count++;
        }

        System.out.println("Output: " + count);
    }
}
