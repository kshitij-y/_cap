
import java.util.HashMap;
import java.util.Map;
/* 
put(K,V)
get(K)
remove(K)
containsKey()
containsValue()
keySet()
values()
entrySet()
size()
isEmpty()
clear()

*/
public class MapPrac {
    public static void main(String[] args) {
        Map<Integer,Integer> mp = new HashMap<>();

        mp.put(1,1);
        mp.put(1,2);
        mp.put(2,2);
        mp.put(3,2);
        mp.put(4,2);

        System.out.println(mp.get(1));
        mp.remove(1);
        System.out.println(mp.containsKey(1));
        System.out.println(mp.containsValue(2));

        System.out.println(mp.keySet());
        System.out.println(mp.values());

        for(Map.Entry<Integer,Integer> en : mp.entrySet()){
            System.out.println(en.getKey()+ " -> " + en.getValue());
        }

        System.out.println(mp);

    }
}
