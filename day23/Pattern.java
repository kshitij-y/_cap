
import java.util.List;



public class Pattern {

    public static boolean checkPatternOne(String s) {
        return s.matches("A*d+i*t+y+a+");
    }
    public static boolean checkPatternTwo(String s) {
        return (s).matches(".*");
    }
    public static boolean checkPatternThree(String s){
        return s.matches("^[A-Z][a-z0-9]* [A-Z0-9]*[a-z]*$");
    }
    public static void main(String[] args) {
        List<String> list = List.of(
            "Aditya",
            "AAAdddiiityaaa",
            "Addittya",
            "dityaa",
            "Adtttyya"
        );

        for(String s:list){
            System.out.println(checkPatternOne(s));
        }

        System.out.println();

        List<String> list1 = List.of(
            "Suraj",
            "SURAJ",
            "suraj",
            "SuRaJ",
            "Suurajj",
            "Suraj@123",
            "S#u@j@123",
            "123Suraj",
            "12345"
        );

        for(String s:list1){
            System.out.println(checkPatternTwo(s));
        }



        List<String> list2 = List.of(
            "Hello World",
            "Java 8",
            "User1 Name",
            "Suraj Kumar",
            "A B",
            "Test Case",

            "Hello",
            "Java8",
            "123",
            "HelloWorld",
            " Hello World",
            "Hello  World"
        );
        System.out.println("List 2: ");

        for(String s:list2){
            System.out.println(checkPatternThree(s));
        }


    }
}
