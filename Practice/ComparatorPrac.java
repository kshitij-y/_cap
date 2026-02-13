
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }


    @Override
    public String toString(){
        return id + " " + name;
    }

    
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b){
        return a.name.compareTo(b.name);
        // return a.id - b.id;
    }
}

public class ComparatorPrac {
    public static void main(String[] args) {
        List<Student> list =  new ArrayList<>(List.of(
            new Student(1, "acd"),
            new Student(2, "sdf"),
            new Student(3, "yuj"),
            new Student(4, "wef"),
            new Student(5, "cv")
        ));

        Collections.sort(list, new NameComparator());
        Collections.sort(list, (s1,s2) -> s1.id - s2.id);
        Collections.sort(list, (a,b) -> a.name.compareTo(b.name));
        list.sort(Comparator.comparing(s -> s.name));


        System.out.println(list);
    }
}
