import java.util.Scanner;

enum Student_Names {
	Aditya,Devansh,Vishnu,Animesh,Mohit,Pawan,Nitish,Kabir;
}
public class EnumOne {
	public static void main(String[] args) {
		System.out.println("main start");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value: ");
		String find = sc.next();
		Student_Names f = Student_Names.valueOf(find);
		Student_Names[] names = Student_Names.values();
		for(Student_Names name : names) {
			if (f==name) {
				System.out.println(find+" is present"+name.ordinal());
			}
		}
		
		System.out.println("main end");
	}
}