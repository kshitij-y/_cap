/*s
Write a java program to check if the given number is Even or Odd by using only if DMS;
*/

class P0 {
    public static void main(String[] args) {
        int a = 10;
        String ans = "ODD";
        if(a%2 == 0){
            ans = "EVEN";
        }

        System.out.println(ans);

    }
}