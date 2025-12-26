
import java.util.Scanner;

class Task15 {

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
    public static int arraySum(int[] arr){
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        return sum;
    }

    public static int greater_than_k(int[] arr, int k){
        int count = 0;
        for(int x:arr){
            if(x > k) count++;
        }
        return count;
    }

    public static int searchIt(int[]  arr, int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] sales = new int[7];
        int[] temp = new int[7];


        System.out.print("Enter sales: ");
        for(int i=0; i<7; i++){
            sales[i] = sc.nextInt();
        }

        System.out.print("Enter temp: ");
        for(int i=0; i<7; i++){
            temp[i] = sc.nextInt();
        }

        // avg temp
        System.out.println("Average temp: " + (double)arraySum(temp)/7);

        //hottest and coldest
        System.out.println("Hottest day: " + largest(temp));
        System.out.println("Coldest day: " + smallest(temp));

        //count >30
        System.out.println("Hot days: " + greater_than_k(temp, 30));

        //total and avg sales
        int totalSales = arraySum(sales);
        System.out.println("Total sales: " + totalSales);
        System.out.println("Average sales: " + (double)totalSales/7);


        // highest and lowest sales
        System.out.println("Highest sales: " + largest(sales));
        System.out.println("Lowest sales: " + smallest(sales));

        //> 100 sales
        System.out.println("High sales days: " + greater_than_k(sales, 100));

        // search for a sale
        System.out.print("Enter a number to search for sales: ");
        int sl = sc.nextInt();
        
        int index = searchIt(sales, sl);
        if(index == -1){
            System.out.println("Not found");
        } else {
            System.out.println("Found it at index: " + index);
        }


        //update the sala for a day
        System.out.print("Enter a Day: ");
        int day = sc.nextInt();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        sales[day-1] = num;

        System.out.print("Sales: ");

        for(int x:sales){
            System.out.print(x + " ");
        }


    }
}