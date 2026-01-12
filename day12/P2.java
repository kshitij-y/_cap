
class Father {

    static int a = 10;

    public static void test() {
        System.out.println("Father Class static method");
    }

    public Father() {
        System.out.println("Father cons");
    }

    static {
        System.out.println("SIB Father class");
        
    }

    {
        System.out.println("IIB Father class");
    }
}


class Son extends Father {

    static int b = 20;

    public Son() {
        super();
        System.out.println("Son cons");
    }

    public static void demo() {
        System.out.println("Son Class static method");
    }

    {

        System.out.println("IIB Son class");
    }

    static {
        System.out.println("SIB Son class");
    }
}

public class P2 {

    static {
        System.out.println("SIB Driver Class");
    }

    public static void main(String[] args) {
        System.out.println("Main Start");

        Son ref = new Son();

        // System.out.println(Father.a);
        // Father.test();
        // System.out.println(Son.a);
        // System.out.println(Son.b);
        // Son.demo();
    }
}
