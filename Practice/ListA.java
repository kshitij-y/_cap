
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListA {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Collections.sort(list);
        Collections.reverse(list);
        
        Iterator<Integer> it = list.listIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
