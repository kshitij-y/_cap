
interface Father {
    static int a = 10;
    int b = 20;

    public static void test(){
        System.out.println("static method");
    }
    abstract public void abs();
}

class Son implements Father {
    @Override
    public void abs(){
        System.out.println("abstract method");
    }
}

public class P2 {
    public static void main(String[] args) {
        System.out.println("Main start\n");

        Father ref = new Son();
        // ref.b = 11; treated as final static var
        // ref.test();
        System.out.println(Father.b);

        System.out.println("\nMain End");
    }
}