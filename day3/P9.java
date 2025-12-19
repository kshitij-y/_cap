import java.util.Scanner;

class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        double m = sc.nextInt();
        char grade;

        if(m >= 90 && m <= 100){
            grade = 'A';
        } else if( 75 <= m && m < 90) {
            grade = 'B';
        } else if( 60 <= m && m < 75) {
            grade = 'C';
        } else if( 40 <= m && m < 60) {
            grade = 'D';
        } else if( 0 <= m && m < 40) {
            grade = 'F';
        } else {
            System.out.println("Invalid");
            return;
        }

        System.out.println("Grade: " + grade);
    }
}