class P4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        if((a = 3) == b){
            System.out.println(a);
        } else {
            System.out.println(a+b);
        }
        /**
         *  ! <- top priority
         * && <- second
         * || <- third
         */
        boolean n = true;
        boolean m = false;
        boolean p = n || m && !n;
        System.out.println(p);
    }
}