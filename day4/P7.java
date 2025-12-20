import java.util.Scanner;

class P7 {
    public static void main(String[] args) {

        System.out.println("Choices: \n1\tCircle \n2\trectangle \n3\ttriangle(Enter only l,b) \n4\tsquare");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");

        String shape = sc.next();

        switch (shape) {
            case "circle":
            case "1":
                double r = sc.nextDouble();
                System.out.println("Area of the circle: " + (3.414 * r * r));
                break;
            case "rectangle":
            case "2":
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println("Area of the circle: " + (l * b));
                break;
            case "traingle":
            case "3":
                double p = sc.nextDouble();
                double q = sc.nextDouble();
                System.out.println("Area of the circle: " + (0.5 * q * p));
                break;
            case "square":
            case "4":
                double s = sc.nextDouble();
                System.out.println("Area of the circle: " + (s*s));
                break;

            default:
                System.out.println("Enter valid shape");
        }
    }
}