
import java.util.Scanner;

class Task1{
    // class Employee{
    //     int id;
    //     String name;
    //     int age;
    //     int dep;
    //     double sal;

    //     public Employee(int id, String name, int age, int dep, double sal) {
    //         this.id = id;
    //         this.name = name;
    //         this.age = age;
    //         this.dep = dep;
    //         this.sal = sal;
    //     }
        
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // variables
        int id,age,dep;
        String name, depName, role, accLevel;
        double sal, basicSal;

        //id
        System.out.print("Enter id(int): ");
        id = sc.nextInt();

        //name
        System.out.print("Enter name: ");
        name = sc.next();

        //age 
        System.out.print("Enter age: ");
        age = sc.nextInt();

        // age check
        if(age < 21){
            System.out.println("Employee is not eligible to work\nMinimum required age is 21");
            return;
        }

        //department
        System.out.println("Departments\n  1 -> IT\n  2 -> HR\n  3 -> Finance");
        System.out.print("Enter department(int): ");
        dep = sc.nextInt();

        //role salary
        switch (dep) {
            case 1:
                depName = "IT";
                System.out.println("Roles\n  developer\n  tester");

                System.out.print("Enter Role: ");
                role = sc.next();

                System.out.print("Enter Basic salary(double): ");
                basicSal = sc.nextDouble();

                switch (role) {
                    case "developer":
                        sal = basicSal + basicSal * 0.3;
                        break;
                    case "tester":
                        sal = basicSal + basicSal * 0.25;
                        break;
                    default:
                        System.out.println("Invalid Role\nTry again from start");
                        return;
                }
                break;
            case 2:
                depName = "HR";
                System.out.println("Roles\n  recruiter\n  payroll");

                System.out.print("Enter Role: ");
                role = sc.next();

                System.out.print("Enter Basic salary(double): ");
                basicSal = sc.nextDouble();

                switch (role) {
                    case "recruiter":
                        sal = basicSal + basicSal * 0.2;
                        break;
                    case "payroll":
                        sal = basicSal + basicSal * 0.22;
                        break;
                    default:
                        System.out.println("Invalid Role\nTry again from start");
                        return;
                }
                break;
            case 3:
                depName = "Finance";
                System.out.println("Roles\n  accountant\n  auditor");

                System.out.print("Enter Role: ");
                role = sc.next();
                
                System.out.print("Enter Basic salary(double): ");
                basicSal = sc.nextDouble();

                switch (role) {
                    case "accountant":
                        sal = basicSal + basicSal * 0.28;
                        break;
                    case "auditor":
                        sal = basicSal + basicSal * 0.26;
                        break;
                    default:
                        System.out.println("Invalid Role\nTry again from start");
                        return;
                }
                break;
            default:
                System.out.println("Invalid Department\nTry again from start");
                return;
        }

        //access level
        if(sal >= 60000 && dep == 1){
            accLevel = "Admin";
        } else if(sal >= 60000 && (dep == 2 || dep == 3) ){
            accLevel = "Manager";
        } else {
            accLevel = "Employee";
        }

        //Output: 
        System.out.println("emp_details:");
        System.out.println("Id:\t\t" + id);
        System.out.println("Name:\t\t"+ name);
        System.out.println("Age:\t\t" + age);
        System.out.println("Department:\t" + depName);
        System.out.println("Role:\t\t" + role);
        System.out.println("Basic Salary:\t" + basicSal);
        System.out.println("Final Salary:\t" + sal);
        System.out.println("Access Level:\t" + accLevel);
    }
}