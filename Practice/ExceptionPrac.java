import java.util.Scanner;

// cusomt exception
class InvalidNumberException extends Exception {
    public InvalidNumberException(String msg){
        super(msg);
    }
}

public class ExceptionPrac {
    public static void main(String[] args) throws InvalidNumberException {

        Scanner sc = new Scanner(System.in);

        try {
            int a = 10;

            if(!sc.hasNextInt()){
                throw new InvalidNumberException("Int required");
            }

            int b = sc.nextInt();

            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            int res = a / b;
            System.out.println(res);

        } catch (NumberFormatException e) {
            System.out.println("Integer required");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
