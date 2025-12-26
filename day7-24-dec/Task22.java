/*
 * print from 1 to n without loop
 */

class Task22 {
    public static void print(int curr, int e){
        if(curr == e+1) return;
        
        System.out.println(curr);
        print(curr+1, e);

    }
    public static void main(String[] args) {
        int s = 1;
        int e = 1000;
        print(s,e);
    }
}