import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MetRef {
    int add(int a, int b);
}


public class MethosRefOne {
    public static void main(String[] args) {
        // MetRef ref1 = (a, b) -> (a+b);
        // System.out.println("Using lambda Exp: " + ref1.add(20, 30));

        MetRef ref2 = Integer::sum;
        System.out.println("Using mehtod reference : " + ref2.add(44, 30));

        List<String> names = Arrays.asList("kshitij", "avinash");

        System.out.println("\nNames: " + names);

        System.out.println("\nUSING LAMBDA");

        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::printf);

    }
}
