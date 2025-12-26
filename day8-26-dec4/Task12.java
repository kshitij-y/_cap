/**
 * print the leader 
 * n is a leader if all the element is its eight is smaller than n
 */
import java.util.Scanner;

class Task12 {
    public static void printLeader(int[] arr){
        int size = arr.length;
        int maxi = arr[size-1];

        System.out.print(arr[size-1] + " ");
        for(int i=size-2; i >= 0; i--){
            if(arr[i] > maxi){
                System.out.print(arr[i] + " ");
                maxi = arr[i];
            }
        }
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

        printLeader(arr);
    }
}