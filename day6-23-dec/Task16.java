

class Task16 {

    public static boolean isPrime(int n){
        if(n == 2) return true;
        if(n%2 == 0) return false;
        for(int i=3; i<=n/2; i = i+2){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Sum of prime number [50,14]: ");
        int sum = 0;
        for(int i = 32; i <= 50; i++) {
            if(isPrime(i)){
                sum += i;
            }
        }

        System.out.println(sum);
        
    }
} 
