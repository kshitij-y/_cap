class Overloading {
    public static void display(int id){
        System.out.println("id: " + id + "\nThis is static display(int id)");
    }
    public static void display(String name){
        System.out.println("name: " + name + "\nThis is static display(String name)");
    }
    public void display(int id, String name) {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("This is non-static display(int id, String name)");
    }
    public void display(){
        System.out.println("Default");
    }
    public static void main(String[] args) {
        Overloading.display(10);
        Overloading.display("Kshitij");

        Overloading e1 = new Overloading();
        e1.display(10, "kumar");
        e1.display();

    }
}