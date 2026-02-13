
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setp {
    public static void main(String[] args) {
        Set<Integer> sh = new HashSet<>();

        Set<Integer> st = new LinkedHashSet<>();
        Set<Integer> st1 = new TreeSet<>();


        sh.add(10);
        sh.add(20);
        sh.remove(10);
        sh.contains(10);
        sh.size();
        sh.isEmpty();
        sh.clear();

        

    }
}
