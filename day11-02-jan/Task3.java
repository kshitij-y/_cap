
class Circle {
    private double rad;


    public void setRad(double rad) { this.rad = rad;}
    public double getRad() {return this.rad;}

    public void calculateArea(){
        double area = Math.PI * rad * rad;
        System.out.println("Area of the circle: " + area);
    }

    public void calculatePeri(){
        double peri = Math.PI * 2 * rad;
        System.out.println("Perimeter of the circle: " + peri);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRad(23.1);

        c1.calculateArea();
        c1.calculatePeri();

    }
}