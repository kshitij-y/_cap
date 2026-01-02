/**
 *  4. Write a Java program that defines a class named DemoClass with the following specifications:

    The class should contain two Static Initialization Blocks (SIBs) that print messages when they execute.
    The class should contain one Instance Initialization Block (IIB) that prints a message when it executes.
    The class should contain one non-static method named displayMessage(), which prints a message when called.
    The class should contain two static methods:
    staticMethodOne(): Prints a message when called.
    staticMethodTwo(): Prints a different message when called.

    Inside the main() method, perform the following actions:
    Call both static methods directly using the class name.
    Create an object of the class, which should trigger the execution of SIBs, IIB, and constructor.
    Call the non-static method using the object reference.

    -------------------------------------------------------------------------------------
 */

class DemoClass {
    static {
        System.out.println("First SIB block");
    }
    static {
        System.out.println("Second SIB block");
    }
    {
        System.out.println("First IIB block");
    }
    public DemoClass(){
        System.out.println("Construtor called");
    }
    public void displayMessage() {
        System.out.println("Non-static");
    }
    public static void staticMethod1(){
        System.out.println("Static methis 1");
    }
    public static void staticMethod2(){
        System.out.println("Static methis 2");
    }
    public static void main(String[] args) {
        DemoClass.staticMethod1();
        DemoClass.staticMethod2();

        DemoClass dc = new DemoClass();
        dc.displayMessage();

    }
}