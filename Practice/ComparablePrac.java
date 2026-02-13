
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    @Override
    public String toString(){
        return id + " " + name;
    }
}

public class ComparablePrac {
    public static void main(String[] args) {
        List<Student> list =  new ArrayList<>(List.of(
            new Student(1, "null"),
            new Student(2, "null"),
            new Student(3, "null"),
            new Student(4, "null"),
            new Student(5, "null")
        ));

        // Collections.sort(list);
        Collections.sort(list, (s1,s2) -> s1.id - s2.id);
        System.out.println(list);
    }
}
