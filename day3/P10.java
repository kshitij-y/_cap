
import java.util.Scanner;

/* 
q. check for upper lower (vowel, cons)
*/

class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input: ");
        char ch = sc.next().charAt(0);

        String res;
        if('a' <= ch && ch <= 'z'){
            if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
                res = "lower case vowel";
            }
            else res = "lower case consonant";
        } else if('A' <= ch && ch <= 'Z'){
            if(ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U'){
                res = "upper case vowel";
            }
            else res = "upper case consonant";
        } else {
            res = "Invalid Input";
        }

        System.out.println("Given character is (" + ch + ") is: " + res);
    }
}