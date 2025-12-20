
import java.util.Scanner;

class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year%4 ==0 && year%100 != 0) || (year%400 == 0)){
            System.out.println(year + ": Leap year");
        }
        else {
            System.out.println(year + ": not a Leap year");
        }
    }
}