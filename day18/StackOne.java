import java.util.Stack;

public class StackOne {
    public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		
		System.out.println(st.empty());
//		System.out.println(st.peek()); EmptyStackException
//		System.out.println(st.pop()); EmptyStackException
		
		System.out.println(st.push(10));
		st.push(14);
		st.push(16);
		st.push(12);
		st.push(13);
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.empty());
	}
}
