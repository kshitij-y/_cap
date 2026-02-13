import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * filter()
 * map()
 * sorted()
 * distinct()
 * limit()
 */


/**
 * forEach()
 * collect()
 * reduce()
 * count()
 * findFirst()
 */

/**
 * toList()
 * toSet()
 * toMap(x -> x, x -> x*2)
 * joining
 */
public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5, 4, 2, 1, 3);

        list.stream()
            .filter(x -> x%2 == 0)
            .forEach(x -> System.out.println(x));

        list.stream()
            .map(x -> x*2)
            .forEach(System.out::println);

        list.stream()
            .sorted()
            .forEach(System.out::print);

        System.out.println("");

        list.stream()
            .distinct()
            .forEach(System.out::print);

        System.out.println("");
        System.out.println(list.stream().count());
        System.out.println(list.stream().distinct().count());

        System.out.println(list.stream().findFirst()); // Optional
        System.out.println(list.stream().reduce(0, (a,b) -> a+b));

        list.stream().limit(3).forEach(System.out::print);


        System.out.println("\nCOllect");
        List<Integer> ab = list.stream().collect(Collectors.toList());
        System.out.println(ab);
    }
}
