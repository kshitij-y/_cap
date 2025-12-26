class Task21 {
    public static int calculateArea(int side){
        return side * side;
    }
    public static double calculateArea(double rad){
        return Math.PI * rad * rad;
    }
    public static int calculateArea(int l, int b){
        return l * b;
    }
    public static void main(String[] args) {
        int side = 4;
        double rad = 5;
        int length = 5, breadth = 12;

        System.out.println("Area of square: " + calculateArea(side));
        System.out.println("Area of circle: " + calculateArea(rad));
        System.out.println("Area of square: " + calculateArea(length, breadth));
    }
}