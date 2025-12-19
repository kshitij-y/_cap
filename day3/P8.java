
import java.util.Scanner;

/*
    q1. check for upper, lower, digit, special char
*/

class P8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter One charactor: ");
        char ch = sc.next().charAt(0);

        String res;
        if('A' <= ch && ch <= 'Z'){
            res = "Upper case";
        } else if ('a' <= ch && ch <= 'b') {
            res = "Lower case";
        } else if ('0' <= ch && ch <= '9') {
            res = "digit";
        } else {
            res = "Special Character";
        }

        System.out.println("Given input (" + ch + ") is " + res);
    }
}