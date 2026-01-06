class Father{
    static int a = 10;

    public static void test() {
        System.out.println("Father Class static method");
    }
    
    static{
        System.out.println("SIB Father class");
    }
}

class Son extends Father{
    static int b = 20;

    public static void demo() {
        System.out.println("Son Class static method");
    }
    
    static{
        System.out.println("SIB Son class");
    }
}


public class P2 {
    static{
        System.out.println("SIB Driver Class");
    }
    public static void main(String[] args) {
        System.out.println("Main Start");


        System.out.println(Father.a);
		Father.test();
		System.out.println(Son.a);
		System.out.println(Son.b);
		Son.demo();
    }
}