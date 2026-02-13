

import java.util.Arrays;

public class StringsP {
    public static void main(String[] args) {
        String s = "abc";
        s = s + " def";
        System.out.println(s);

        char[] str = s.toCharArray();
        Arrays.sort(str);

        s = new String(str);
        System.out.println(s.trim());


        String st = "123";

        Integer it = Integer.valueOf(st);
        System.out.println(it);

        String ss = String.valueOf(it);
        System.out.println(ss);
    }
}