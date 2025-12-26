
import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 = new int[4];

        for(int i=0; i<4; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println("Size: " + arr.length);
        // System.out.println("Arr: " + arr1);

    }
}