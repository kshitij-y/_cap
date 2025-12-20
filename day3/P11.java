
import java.util.Scanner;

// negative postive or zero

class P11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        String res;

        if(a > 0) res = "Postive";
        else if(a == 0) res = "Zero";
        else res = "Negative";
        
        System.out.println("Number is: "+ res);
    }
}