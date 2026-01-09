/**
 * WAJP to achieve multiple inheritance
 */

interface Father {
    abstract void fatherWay();
}

interface Mother {
    abstract void motherWay();
}

class Son implements Father, Mother {
    @Override
    public void fatherWay(){
        System.out.println("father method");
    }

    @Override
    public void motherWay(){
        System.out.println("mother method");
    }
}

public class P3 {
    public static void main(String[] args) {
        Father ref = new Son();
        ref.fatherWay();
        // ref.motherWay(); : Error

        Mother ref1 = new Son();
        ref1.motherWay();
        // ref1.fatherWay(); : Error
    }
}