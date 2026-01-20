
import java.util.List;

/**
 * 1. Write a Java Stream one-liner to sort Students objects by id in ascending order and print them.
 * 2. Write a Java Stream one-liner to sort Students objects by id in descending order and print them.
 * 3. Write a Java Stream one-liner to sort Students objects based on name and display the result.
 * 4. Write a Java Stream one-liner to sort Students objects by marks and print them.
 * 5. ⁠Write a Java Stream one-liner to add 5 grace marks to each student and print the updated marks.
 */


class Students {
    int id;
    String name;
    double marks;

    public Students(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void printDetails() {
        System.out.printf("ID: %d, Name: %s, Marks: %.2f%n", id, name, marks);
    }
}
public class SortStudent {
    public static void main(String[] args) {
        List<Students> list = List.of(
            new Students(3, "Alice", 85.0),
            new Students(1, "Bob", 90.0),
            new Students(2, "Charlie", 78.0)
        );

        System.out.println("Sorting by ID in Ascending Order:");
        list.stream()
            .sorted((s1, s2) -> Integer.compare(s1.id, s2.id))
            .forEach(Students::printDetails);

        System.out.println("\nSorting by ID in Descending Order:");
        list.stream()
            .sorted((s1, s2) -> Integer.compare(s2.id, s1.id))
            .forEach(Students::printDetails);

        System.out.println("\nSorting by Name:");
        list.stream()
            .sorted((s1,s2) -> s1.name.compareTo(s2.name))
            .forEach(Students::printDetails);

        System.out.println("\nAdding 5 Grace Marks to Each Student:");
        list.stream().forEach(s -> {
            s.marks += 5;
            s.printDetails();
        });
    
    }
}
