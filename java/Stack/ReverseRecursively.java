import java.util.Scanner;
import java.util.Stack;
public class ReverseRecursively {



    static void reverse(Stack<Integer> st ){
        
        if(st.isEmpty()){
            return;
        }

        int tem = st.pop();
        reverse(st);
        pushAtBottom(st, tem);
    }



    static void pushAtBottom(Stack<Integer> st,int val){

        Stack<Integer> tem = new Stack<>();

        while(!st.isEmpty()){
            tem.push(st.pop());
        }

        st.push(val);

        while(!tem.isEmpty()){
            st.push(tem.pop());
        }
    }



    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            Stack<Integer> st = new Stack<>();

            System.out.print("Enter size of stack:- ");
            int size= sc.nextInt();

            System.out.println("Enter the element of stack:- ");
            for(int i=0;i<size;i++){
                st.push(sc.nextInt());
            }

            reverse(st);
            System.out.println("Stack is reverse:- "+st);

        }
    }
}
