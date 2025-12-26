/**
 * return the number in arr which has maximum occ of digit k
 */
import java.util.Scanner;

class Task13 {
    public static int countK(int num, int k){
        int count = 0;
    
        while(num!= 0) {
            int digit = num%10;
            if(digit == k)count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter k ");
        int k = sc.nextInt();

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int maxCount = 0;
        int maxCountIndex = 0;

        System.out.print("Enter the array element: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            int countOfk = countK(arr[i], k);
            if(countOfk > maxCount){
                maxCountIndex = i;
            }
        }

        System.out.println("Output: " +  arr[maxCountIndex]);

    }

}