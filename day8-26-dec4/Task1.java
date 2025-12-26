/*
 * print from 500 to 50 without loop
 */

class Task1 {
    public static void print(int curr, int e){
        if(curr == e-1) return;
        
        System.out.println(curr);
        print(curr-1, e);

    }
    public static void main(String[] args) {
        int s = 500;
        int e = 50;
        print(s,e);
    }
}