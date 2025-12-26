
import java.util.Scanner;


class Task7 {
    public static boolean isPrime(int n){
        
        if(n == 2) return true;
        if(n%2 == 0) return false;
        for(int i=3; i<=n/2; i = i+2){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static boolean isPerfect(int n){
        int sum = 0;
        for(int i=1; i <= n/2; i++){
            if(n%i == 0){
                sum += i;
                if(sum > n){
                    return false;
                }
            }
        }
        return sum == n;
    }

    public static int arraySum(int[] arr){
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        return sum;
    }
    public static int arrayProduct(int[] arr){
        int pro = 1;
        for(int i:arr){
            pro *= i;
        }
        return pro;
    }
    public static int smallest(int[] arr){
        int ans = arr[0];
        for(int i:arr){
            ans = Math.min(ans, i);
        }
        return ans;
    }
    public static int largest(int[] arr){
        int ans = arr[0];
        for(int i:arr){
            ans = Math.max(ans, i);
        }
        return ans;
    }

    public static int secondSmallest(int[] arr){
        int first = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE - 1;

        for(int i:arr){
            if(i < first){
                sec = first;
                first = i;
            } else if(sec > i && i > first) {
                sec = i;
            }
        }

        return sec;
    }

    public static int secondLargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE+1;

        for(int i:arr){
            if(i > first){
                sec = first;
                first = i;
            } else if(first > i && i > sec) {
                sec = i;
            }
        }

        return sec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter arr elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        //prime
        System.out.print("Primes: ");
        for(int i=0; i<size; i++){
            if(isPrime(arr[i])) System.out.print(arr[i] + " ");
        }System.out.println("");

        System.out.print("Evens: ");
        for(int i=0; i<size; i++){
            if(arr[i]%2 == 0) System.out.print(arr[i] + " ");
        }System.out.println("");

        System.out.print("Perfects: ");
        for(int i=0; i<size; i++){
            if(arr[i]%2 == 0) System.out.print(arr[i] + " ");
        }System.out.println("");

        System.out.println("Sum of arr: " + arraySum(arr));

        System.out.println("Product of arr: " + arrayProduct(arr));

        System.out.println("Smallest in arr: " + smallest(arr));
        System.out.println("Largest in arr: " + largest(arr));

        System.out.println("Second Smallest in arr: " + secondSmallest(arr));
        System.out.println("Second Largest in arr: " + secondLargest(arr));


    }
}