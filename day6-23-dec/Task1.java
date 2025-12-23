
import java.util.Scanner;

class TASK1 {

    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'A'
                || c == 'e' || c == 'E'
                || c == 'i' || c == 'I'
                || c == 'o' || c == 'O'
                || c == 'u' || c == 'U');
    }

    public static void print(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void printRev(int a, int b) {
        for (int i = a; i >= b; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a char: ");
        char ch = sc.next().charAt(0);
        if ('A' <= ch && ch <= 'Z') { // upperCase

            if (isVowel(ch)) { // uppercase Vowel
                System.out.println("Uppercase Vowel: ");
                print(10, 20);
            } else { // uppercase consonant
                System.out.println("Uppercase Consonant");
                printRev(25, 10);
            }
        } else { // lowerCase

            if (isVowel(ch)) { // vowel
                System.out.println("Lowercase Vowel");
                printRev(-10, -20);
            } else { // lowerCase contsonant
                System.out.println("Lowercase Consonant");
                print(-25, -15);
            }
        }

    }
}
