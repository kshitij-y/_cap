
import java.util.Scanner;

public class ArithmaticEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        if(!(age instanceof Integer)){
            throw new IllegalArgumentException("Age must of Integer type");
        }

    }
}
