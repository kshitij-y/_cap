
class Task3{
    public static void main(String[] args) {
        System.out.println("Divisible by 7 in [100, 50]");
        for(int i=100; i>= 50; i--){
            if(i%7 == 0) System.out.print(i + " ");
        }
    }
}