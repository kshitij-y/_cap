
interface Father {
    abstract public void test();
    abstract public int add(int a, int b);
}

class Son implements Father {
    @Override
    public void test(){
        System.out.println("Abstract method override");
    }

    @Override
    public int add(int a, int b){
        return a+b;
    }
}

public class P1 {
    public static void main(String[] args) {
        System.out.println("Main start");

        // Father ref = new Father();  error: Father is abstract; cannot be instantiated

        Father ref = new Son();
        ref.test();
        System.out.println(ref.add(10, 20));

        System.out.println("Main End");
    }
}