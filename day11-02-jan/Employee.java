class Employee {
    int id;
    String name;
    double sal;

    public Employee(int id, String name, double sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public void printDetails(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.sal);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Kshitij", 100000);
        Employee e2 = new Employee(1, "Avinash", 100000);
        Employee e3 = new Employee(1, "Aarush", 100000);
        Employee e4 = new Employee(1, "Kshitij", 100000);

        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
        e4.printDetails();

    }
}