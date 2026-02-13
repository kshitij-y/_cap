public class StrringB {
    public static void main(String[] args) {
        String str = "AJHBCWEDRFwef";
        StringBuilder sb = new StringBuilder(str);

        sb.append(" appended");
        System.out.println(sb.toString());

        sb.insert(5, " INSERT ");
        System.out.println(sb.toString());

        sb.delete(0, 5);
        System.out.println(sb.toString());

        sb.deleteCharAt(0);
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());

        sb.setCharAt(0, 'Z');
        System.out.println(sb.toString());

    }
}