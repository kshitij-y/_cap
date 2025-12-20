
import java.util.Scanner;

class P5 {
    public static void main(String[] args) {

        System.out.println("Choices: \n1\taddition \n2\tsubtraction \n3\tmultiplication \n4\tdivision");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1: {
                System.out.print("Enter no.of var: ");
                int n = sc.nextInt();
                int total = 0;

                System.out.print("Enter no.of var: ");
                for(int i=0; i<n; i++){
                    int var = sc.nextInt();
                    total += var;
                }
                System.out.println("Sum: " + total);
                break;
            }
            case 2: { // subtraction
                System.out.print("Enter two int: ");
                int n = sc.nextInt();
                int m = sc.nextInt();
                System.out.println("Result: " + (n-m));
                break;
            }
            case 3: {
                System.out.print("Enter no.of var: ");
                int n = sc.nextInt();
                int total = 1;
                
                System.out.print("Enter no.of var: ");
                for(int i=0; i<n; i++){
                    int var = sc.nextInt();
                    total *= var;
                }
                System.out.println("Product: " + total);
                break;
            }
            case 4: {
                System.out.print("Enter two var: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(b == 0) {
                    System.out.println("Cannot divide by Zero");
                    break;
                }
                System.out.println("Result: " +  a/b);
                break;
            }
            default:
                System.out.println("Enter valid choice");
                break;
        }
    }
}