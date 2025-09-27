import java.util.Stack;
public class basicas {
    public static void main(String[] aStrings){
        Stack<Integer> st = new Stack<>();
        
        // add element
        st.push(5);
        st.push(87);
        st.push(3);
        
        //peak;
        System.out.println(st.peek()); // print peak
        System.out.println(st); // print whole stack

        st.pop(); // remove last element
        System.out.println(st);

        System.out.println("Size of integer:- "+ st.size());
    }
}