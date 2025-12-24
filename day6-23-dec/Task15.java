class Task15 {

    public static boolean isPrime(int n){
        if(n == 2) return true;
        if(n%2 == 0) return false;
        for(int i=3; i<=n/2; i = i+2){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static int fact(int n){
        
        int pro = 1;
        for(int i=1; i <= n; i++){
            pro *= i;
        }
        return pro;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of all prime number fromr range 14 to 5");

        for(int i = 14; i>= 5; i--) {
            if(isPrime(i)){
                System.out.print(fact(i) + " ");
            }
        }
        
    }
}