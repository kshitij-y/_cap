
/**
 * Strong number -> sum of fact of each digit == original
 */
class Task13{
    public static int fact(int n){
        
        int pro = 1;
        for(int i=1; i <= n; i++){
            pro *= i;
        }
        return pro;
    }
    public static boolean isStrong(int n){
        int temp = n;
        int sum = 0;
        while(temp != 0){
            int digit = temp % 10;
            sum += fact(digit);
            temp /= 10;
        }

        return (sum == n);
    }
    public static void main(String[] args) {
        System.out.println("Strong number in [1, 1000]");
        for(int i=1; i<=100000; i++) {
            if(isStrong(i)) System.out.print(i + " ");
        }
    }
}
