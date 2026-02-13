
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueuePrac {
    public static void main(String[] args) {
        Queue<Integer> q0 = new LinkedList<>();
        Queue<Integer> q1 = new PriorityQueue<>();
        Queue<Integer> q2 = new ArrayDeque<>();


        q1.offer(2);
        q1.peek();
        q1.poll();


        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(1);
        st.pop();
        st.peek();



    }    
}
