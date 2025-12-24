
import java.util.Scanner;

class Task17 {
    public static void clockProblem(int input1 , int input2){
        int res = input1 * input2;
        res %= 12;

        if(res == 0){
            System.out.println("12");
        } else {
            System.out.println(res);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input1: ");
        int input1 = sc.nextInt();
        
        System.out.print("Enter input2: ");
        int input2 = sc.nextInt();

        clockProblem(input1, input2);


    }
}