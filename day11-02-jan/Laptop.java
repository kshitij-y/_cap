
/*
    Write a Java program to create a Laptop class that demonstrates constructor chaining using this().

    Requirements:

    The Laptop class should have three instance variables:
    brand (String)
    ramSize (int)
    price (double)

    Implement the following constructors using constructor chaining (this()):

    Default constructor that sets default values ("Unknown", 8GB, 50000.0).
    Constructor with only brand (calls the default constructor).
    Constructor with brand and ramSize (calls the constructor with brand).
    Constructor with all three fields (brand, ramSize, price) --(the final constructor)--.

    Create a printDetails() method to display laptop details.

    In main(), create different Laptop objects using all constructors and print their details.
*/
class Laptop {
    String brand;
    int ramSize;
    double price;

    public Laptop(){
        this("Unknown", 8, 50000.0);
    }

    public Laptop(String brand){
        this(brand, 8, 50000.0);
    }

    public Laptop(String brand, int ramSize){
        this(brand, ramSize, 50000.0);
    }

    public Laptop(String brand, int ramSize, double price) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("BRAND: " + this.brand);
        System.out.println("RAM: " + this.ramSize);
        System.out.println("PRICE: " + this.price);
    }
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("Asus");
        Laptop l3 = new Laptop("Lenevo", 16);
        Laptop l4 = new Laptop("Framework", 32, 90000.0);

        l1.printDetails();
        l2.printDetails();
        l3.printDetails();
        l4.printDetails();


    }
}