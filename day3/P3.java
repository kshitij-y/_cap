class P3{
    public static void main(String[] args) {
        int a = 5;
        System.err.println(++a <= 10 | ++a >= 20);
        System.err.println(a);

        int b = 5;
        System.err.println(++b <= 10 || ++b >= 20);
        System.err.println(b);
    }
}