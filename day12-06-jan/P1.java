class Address {
    String city;
    String state;
    public Address(String city, String state){
        this.city = city;
        this.state = state;
    }
}

class Student {
    int id;
    String name;
    Address address;
    public Student (int id, String name, Address ad) {
        this.id = id;
        this.name = name;
        this.address = ad;
    }

    public void display(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address.city + " "  + this.address.state);
    }
}

public class P1 {
    public static void main(String[] args) {
        Address ad = new Address("Nasriganj", "Bihar");
        Student st = new Student(1, "Kshitij", ad);

        st.display();
    }
}