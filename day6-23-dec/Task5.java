class Task5{
    public static void main(String[] args) {
        System.out.println("Product of numbers [1, 10]");
        int pro = 1;
        for(int i=1; i<=10; i++){
            pro *= i;
        }
        System.out.println("Product: " + pro);
    }
}