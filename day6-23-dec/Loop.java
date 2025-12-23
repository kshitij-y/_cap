/**
 * while -> when we do not know how any iteration do we need
 * do while -> when we need atleast one iteration do be done
 * for loop -> when we know in advance how mmany iteration we need
 */

class Loop {
    public static void printLoop(int i, int n) { // smaller to greater
        while(i <= n){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
    }
    public static void printLoopRev(int i, int n) { // greater to smaller
        
        while(i >= n){
            System.out.print(i + " ");
            i--;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        printLoopRev(-123, -129);
        printLoop(79, 84); 
        printLoop(-110, -100); 
        printLoopRev(0, -9);         
    }
}