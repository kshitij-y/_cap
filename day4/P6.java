import java.util.Scanner;

class P6 {
    public static void main(String[] args) {
        System.out.println("Choices: \n1\tIT \n2\tHR \n3\tFinance \n4\tOperations");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department: ");
        String dep = sc.next();

        switch (dep) {
            case "IT":
            case "1":
                System.out.println("IT emplpoyees Designation");
                System.out.println("\tDeveloper \n\tTester \n\tDevops Engineer");
                break;
            case "HR":
            case "2":
                System.out.println("HR emplpoyees Designation");
                System.out.println("\tRecruiter \n\tHR exec \n\tPayroll Officer");
                break;
            case "Finance":
            case "3":
                System.out.println("Finance emplpoyees Designation");
                System.out.println("\tAccountant \n\tFinancial Analyst \n\tAuditor");
                break;
            case "Operations":
            case "4":
                System.out.println("Operations emplpoyees Designation");
                System.out.println("\tOps. Exec. \n\tTEam Lead \n\tManager");
                break;
            default:
                System.out.println("Invalid Department name");
                break;
        }
    }
}