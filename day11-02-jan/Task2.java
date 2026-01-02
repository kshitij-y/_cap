
/**
 * Q2. Write a Java program to create a class called Employee with private instance variables employee_id,
 * employee_name, and employee_salary. Provide public getter and setter methods to access and modify the
 * id and name variables, but provide a getter method for the salary variable that returns a formatted
 * string.
 * ------------------------------------------------------------------------------------------
 */

class Employee {

    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public int getId() {
        return this.employee_id;
    }

    public void setId(int id) {
        this.employee_id = id;
    }

    public String getName() {
        return this.employee_name;
    }

    public void setName(String name) {
        this.employee_name = name;
    }

    public String getSal() {
        return String.format("%.2f", this.employee_salary);
    }

    public void setSal(double sal) {
        this.employee_salary = sal;
    }

}

public class Task2 {
    static {
        System.out.println("Employee Deatils: ");
    }

    static void showDetails(Employee e) {
        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSal());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setId(4);
        e1.setName("Kshitij");
        e1.setSal(123456.0);

        showDetails(e1);

    }
}