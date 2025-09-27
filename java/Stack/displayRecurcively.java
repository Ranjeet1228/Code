import java.util.Scanner;
import java.util.Stack;

public class displayRecurcively {

    static void display(Stack<Integer> st){
        if(st.isEmpty()) return;

        int x=st.pop();
        display(st);
        System.out.print(x+" ");
        st.push(x);
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            Stack<Integer> st = new Stack<>();

            System.out.print("Enter the length of Stack:- ");
            int size = sc.nextInt();

            System.out.println("Enter the element of Stack:- ");
            for(int i=0;i<size;i++){
                st.push(sc.nextInt());
            }

            display(st);

        }
    }
}