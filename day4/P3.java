
import java.util.Scanner;

class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fruit name: ");
        String st = sc.next();
        String res;

        switch (st) {
            case "apple":
                res = "Apples are richer in fiber.";
                break;
            case "banana":
                res = "Bananas are a great source of K.";
                break;
            case "mango":
                res = "Mangoes are the king of fruits!";
                break;
            case "orange":
                res = "Oranges are packed with vitamin C.";
                break;
            default:
                res = "Sorry, I don't have info";
                break;
        }

        System.out.println("Info: " + res);
    }
}