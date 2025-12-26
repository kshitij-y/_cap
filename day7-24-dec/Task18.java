class Task18 {
    public static boolean isPrime(int n){
        
        if(n == 2) return true;
        if(n%2 == 0) return false;
        for(int i=3; i<=n/2; i = i+2){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.print("0 1 ");
        int c;
        while(n-2 > 0){
            c = a+b;
            System.out.print(c+ " ");
            a = b;
            b = c;
            n--;
        }
    }
    public static int findMin(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }
    public static int findMax(int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }
    public static void main(String[] args) {
        int a=10, b=6, c=8, n=10;

        if(isPrime(n)) System.out.println(n + ": Prime");
        else System.out.println(n + ": non-Prime");

        System.out.print("Fibonacci series: ");
        fibonacci(n);

        System.out.println("\nMaximum: " + findMax(a, b, c));
        System.out.println("Minimum: " + findMin(a, b, c));
    }
}