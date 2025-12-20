import java.util.Scanner;

class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        char ch = sc.next().charAt(0);
        String res;
        switch (ch) {
            case 'A', 'a':
                res = "Excellent";
                break;
            case 'B', 'b':
                res = "Good";
                break;
            case 'C', 'c':
                res = "Fair";
                break;
            case 'D', 'd':
                res = "Pass";
                break;
            case 'F', 'f':
                res = "Fail";
                break;
            default:
                res = "Invalid Input";
        }

        System.out.println("Output: " + res);
    }
}