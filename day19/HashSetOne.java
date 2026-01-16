
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetOne {
    public static void main(String[] args) {
        Set<Object> hs = new HashSet<>();

        hs.add(10);
        hs.add(10);
        hs.add(12);
        hs.add('a');
        hs.add("Kshitij");
        hs.add(null);

        System.out.println(hs);

        for(Object obj:hs){
            System.out.print(obj + " ");
        }System.out.println();

        Iterator<Object> itr = hs.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }

    }
}
