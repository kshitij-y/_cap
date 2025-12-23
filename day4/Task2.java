
import java.util.Scanner;

class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id, tType, age, class_id;
        String name, type, cls, isBooked;
        double fare, baseFare, discount_amnt=0;
        boolean isGov;

        //id
        System.out.print("Enter id(int): ");
        id = sc.nextInt();

        //name
        System.out.print("Enter name: ");
        name = sc.next();

        //age 
        System.out.print("Enter age: ");
        age = sc.nextInt();

        if (age < 5) {
            System.out.println("No booking is requried under age 5");
            return;
        }

        if (age > 80) {
            System.out.println("Medical clearance reequired");
            return;
        }

        // travel type
        System.out.println("Travel types:\n  1 -> Bus\n  2 -> Train\n  3 -> Flight");
        System.out.print("Enter Travel type: ");
        tType = sc.nextInt();

        switch (tType) {
            case 1:
                type = "BUS";

                System.out.println("Class\n  1-Sleeper\n  2-Seater");
                System.out.print("Enter class type(int): ");
                class_id = sc.nextInt();

                System.out.print("Enter Basic salary(double): ");
                baseFare = sc.nextDouble();


                switch (class_id) {
                    case 1:
                        cls = "Sleeper";
                        fare = baseFare * 1.2;
                        break;
                    case 2:
                        cls = "Seater";
                        fare = baseFare * 1.0;
                        break;
                    default:
                        System.out.println("Wrong class type\nPlz try again");
                        return;
                }
                break;
            case 2:
                type = "TRAIN";

                System.out.println("Class\n  1-General\n  2-Sleeper\n  3-AC");
                System.out.print("Enter class type(int): ");
                class_id = sc.nextInt();

                System.out.print("Enter Basic salary(double): ");
                baseFare = sc.nextDouble();

                switch (class_id) {
                    case 1:
                        cls = "General";
                        fare = baseFare * 1.0;
                        break;
                    case 2:
                        cls = "Sleeper";
                        fare = baseFare * 1.3;
                        break;
                    case 3:
                        cls = "Seater";
                        fare = baseFare * 1.6;
                        break;
                    default:
                        System.out.println("Wrong class type\nPlz try again");
                        return;
                }
                break;
            case 3:
                type = "FLIGHT";

                System.out.println("Class\n  1-Economy\n  2-Business");
                System.out.print("Enter class type(int): ");
                class_id = sc.nextInt();

                System.out.print("Enter Basic fare(double): ");
                baseFare = sc.nextDouble();

                switch (class_id) {
                    case 1:
                        cls = "Economy";
                        fare = baseFare * 2.5;
                        break;
                    case 2:
                        cls = "Business";
                        fare = baseFare * 3.5;
                        break;
                    default:
                        System.out.println("Wrong class type\nPlz try again");
                        return;
                }
                break;

            default:
                System.out.println("Failed! Invalid Travel Type");
                return;
        }

        System.out.println("Are you government Employee(true/false)? ");
        isGov = sc.nextBoolean();

        //discount
        if(age >= 60){
            System.out.println("Congrats! you are eligible for 30% senior Citizen Discount");
            fare *= 0.7;
            discount_amnt = fare * .3;
        } else if(isGov){
            System.out.println("Congrats! you are eligible for 15% discount");
            fare *= 0.85;
            discount_amnt = fare * .15;
        } else if(5 < age && age < 12){
            System.out.println("Congrats! you are eligible for 15% discount");
            fare *= 0.5;
            discount_amnt = fare * .5;
        }


        //booking Status
        if(fare >= 10000){
            if(tType == 3) isBooked = "Booking Confirmed";
            else isBooked = "Waiting list";
        } else isBooked = "Booking Confirmed";

        System.out.println("===============================");
        System.out.println("=======<Booking Details>=======");
        System.out.println("===============================");

        System.out.println("Id:\t\t" + id);
        System.out.println("Name:\t\t"+ name);
        System.out.println("Age:\t\t" + age);
        System.out.println("Travel type:\t" + type);
        System.out.println("Class:\t\t" + cls);
        System.out.println("Base Fare:\t" + baseFare);
        System.out.println("Discount:\t" + discount_amnt);
        System.out.println("Final Fare:\t" + fare);
        System.out.println("Booking sts:\t" + isBooked);


    }
}
