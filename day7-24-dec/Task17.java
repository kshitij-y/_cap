/**
 * 4 methods
 * 1st -> add three
 * 2nd -> mul three 
 * 3rd -> sub (a - b - c - d)
 * 4th -> add 2 var
 */

class Task17 {
    public static int addition(int a, int b, int c, int d) {
        return a + c + b + d;
    }
    public static int multiFour(int a, int b, int c, int d) {
        return a * b * c * d;
    }
    public static int addition(int a, int b) {
        return a + b;
    }
    public static int substract(int a, int b, int c, int d) {
        return a - b - c - d;
    }
    public static void main(String[] args) {
        int a = 10, b = 9, c = 8, d = 7;
        System.out.println("Sum of four: " + addition(a, b, c, d));
        System.out.println("Multiply of four: " + multiFour(a, b, c, d));
        System.out.println("Sum of two: " + addition(a, b));
        System.out.println("Substraction of four: " +  substract(a, b, c, d));
    }
}