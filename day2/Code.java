class Code {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("a -> "+a+ " ,b -> " + b);

        // swap using third
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a -> "+a+ ", b -> " + b);

        // swap without using third
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a -> "+a+ ", b -> " + b);

        // sum and avarage
        int c = 16;
        int sum = a+b+c;
        int avg = sum/3;
        System.out.println("a -> "+a+ ", b -> " + b + ", c -> " + c);
        System.out.println("Sum -> " + sum);
        System.out.println("Avg -> " + avg);

        // c to f
        double cel = 36.0;
        double far = (cel*1.8) + 32.0;
        System.out.println(cel+" celsius into fahrenheit: " + far);

        // Odd Even
        if(sum%2 == 0){
            System.out.println(sum + " is Even.");
        }else{
            System.out.println(sum + " is Odd.");
        }

    }
}