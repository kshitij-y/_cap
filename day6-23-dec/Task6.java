
import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input(int): ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            boolean div3 = (i%3 == 0);
            boolean div5 = (i%5 == 0);

            if(div3 && div5) System.out.println("FizzBuzz");
            else if(div3 && !div5) System.out.println("Fizz");
            else if(!div3 && div5) System.out.println("Buzz");
            else System.out.println(i);

        }
    }
}