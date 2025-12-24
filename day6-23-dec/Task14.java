

class Task14 {
    public static int fact(int n){
        
        int pro = 1;
        for(int i=1; i <= n; i++){
            pro *= i;
        }
        return pro;
    }
    public static void main(String[] args) {
        System.out.println("Factorial of Odd number b/w 1 and 10");

        for(int i=1; i<=10; i += 2){
            System.out.print(fact(i) + " ");
        }
    }
}