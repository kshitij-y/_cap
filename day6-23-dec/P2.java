class P2 {
    public static void main(String[] args) {
        int i = -111;
        do { 
            System.out.print(i + " ");
            i++;
        } while (i <= -101);
        System.out.println("");

        int j = 123;
        do { 
            System.out.print(j + " ");
            j--;
        } while (j >= 113);
        System.out.println("");

        char c = 's';
        do { 
            System.out.print(c + " ");
            c--;
        } while (c >= 'l');
    }
}