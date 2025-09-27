import java.util.Scanner;
import java.util.Stack;

public class insertRecusively {

    static void Insert(Stack<Integer> st, int idx, int data){
        if(st.size()==idx){ //base case
            st.push(data);
            return;
        }
        int tem = st.pop();
        Insert(st, idx, data);
        st.push(tem);
    
    }

    public static void main(String[] args){
        try(Scanner sc = new Scanner (System.in)){

            Stack<Integer> st = new Stack<>();

            System.out.print("Enter size:- ");
            int size = sc.nextInt();

            System.out.println("Enter element of Stack:- ");
            for(int i=0;i<size;i++){
                st.push(sc.nextInt());
            }

            System.out.println("Enter index to be entered:- ");
            int idx = sc.nextInt();
            
            if(idx<0|| idx>st.size()){
                System.out.println("Out of index");
                return;
            }
            System.out.println("Enter data:- ");
            int data = sc.nextInt();

            Insert(st,idx,data);
            System.out.println("Updated version:- "+st);

        }
    }
}
