
/**
 * [* -> 0 or more]
 * [+ -> 1 or more]
 * [l? -> l zero or one]
 * 
 * 
 */
public class Regex {
    public static void main(String[] args) {
        System.out.println("j".matches("s*j"));         // true
        System.out.println("Sj".matches("s*j"));        // false
        System.out.println("SSj".matches("S+j"));       // true
        System.out.println("SSSj".matches("S*j"));      // true
        System.out.println("sSj".matches("S*j"));       // false

        System.out.println();

        System.out.println("colr".matches("colo?r"));   // true
        System.out.println("color".matches("colo?r"));  // true
        System.out.println("coloor".matches("colo?r")); // false

        System.out.println();

        System.out.println("abc".matches("ab(c)"));     //true
        System.out.println("ab".matches("ab(c)?"));     //true
        System.out.println("ab".matches("ab(cd)?"));    //true
        System.out.println("abcd".matches("ab(cd)?"));  //false
    }
}
