
@FunctionalInterface
interface Factorial {
    int findFact(int n);
}

class AbsBody implements Factorial {
    @Override
    public int findFact(int n){
        if(n <= 1) return 1;
        else return n * findFact(n-1);
    }
}

public class FITwo {
    public static void main(String[] args) {
        Factorial ref = new AbsBody();
        System.out.println(ref.findFact(5));

        Factorial obj = (n) -> {
            int fact = 1;
            for(int i=1; i<=n; i++){
                fact *= i;
            }
            return fact;
        };

        System.out.println(obj.findFact(5));

    }
}
