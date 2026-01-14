
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorOne {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        ListIterator<Integer> lit = li.listIterator();

        System.out.println(lit.hasPrevious());
        System.out.println(lit.hasNext());
        
        System.out.println(lit.next());
        System.out.println(lit.previous());
        System.out.println(lit);

        while(lit.hasNext()){
            System.out.print(lit.next() + " ");
        }
        System.out.println();
        
        while(lit.hasPrevious()){
            System.out.print(lit.previous() + " ");
        }
        
    }
}
