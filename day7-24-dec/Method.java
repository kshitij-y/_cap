
class Method {
    public static void main(String[] args) {
        Integer abc = 10;
        powerButton(abc);
        System.out.println(abc); // will log 10
    }
    public static void powerButton(Integer abc){
        System.out.println("Screen on/off");
        abc = 20; // will not do any change to main abc
    }
}