
import java.util.List;


class Emp {
    int id;
    String name;
    double sal;

    Emp(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public void printDetails() {
        System.out.printf("ID: %d, Name: %s, Salary: %.2f%n", id, name, sal);
    }
}
public class MetRefTwo {
    public static void main(String[] args) {
        List<Emp> list = List.of(
            new Emp(1, "Kshitij", 150000.0),
            new Emp(3, "Kshitij", 150000.0),
            new Emp(2, "Kshitij", 150000.0)
        );

        list.forEach( e -> e.printDetails());
        list.forEach(Emp::printDetails);
    }
}
