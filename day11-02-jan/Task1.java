/**
 * Q1. Write a Java program to create a class called Task1 with private instance variables name, age. and 
 * country. Provide public getter and setter methods to access and modify these variables.
------------------------------------------------------------------------------------------
 */

class Task1 {
    private String name;
    private int age;
    private String country;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }


    public static void main(String[] args) {
        Task1 t1 = new Task1();

        t1.setName("kshitij");
        t1.setAge(21);
        t1.setCountry("India");

        System.out.println("Name: " + t1.getName());
        System.out.println("Age: " + t1.getAge());
        System.out.println("Country: " + t1.getCountry());
    }   
}