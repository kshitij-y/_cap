class P1 {
    public static void main(String[] args) {
        int a = -10;
        int b = ++a + a++ -5;
        int c = a++ + b++ + ++b - a;
        a = c++ + ++c - c + b++;
        b = a++ + c++ + ++c - ++a;
        System.out.println(a);
        System.out.println(++b);
        System.out.println(c);
    }
}