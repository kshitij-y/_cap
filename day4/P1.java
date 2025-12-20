
import java.util.Scanner;

class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String day = sc.nextLine();
        String res;

        if("monday".equals(day) || "tuesday".equals(day) || "wednesday".equals(day)
         || "thrusday".equals(day) || "friday".equals(day)){
            res = "Weekday";
        } 
        else if("saturday".equals(day) || "sunday".equals(day)){
            res = "Weekend";
        }
        else {
            res = "Invalid";
        }

        System.out.println("Day: " + res);
    }
}