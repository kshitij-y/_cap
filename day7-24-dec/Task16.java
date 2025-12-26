
import java.util.Scanner;

class Task16 {
    public static int pow(int n, int b) {
        int pro = 1;
        for(int i=1; i<=b; i++){
            pro *= n;
        }
        return pro;
    }
    public static boolean disarium(int n){
        int sum = 0;
        int count = 1;
        while(n != 0){
            int digit = n%10;
            sum = sum + pow(digit, count);
            n /= 10;
        }
        return sum == count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(disarium(n)) System.out.println("Disarium");
        else System.out.println("not a disarium");

    }
}