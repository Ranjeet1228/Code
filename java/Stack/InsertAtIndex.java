import java.util.Scanner;
import java.util.Stack;

public class InsertAtIndex {
    public static void main(String[] args){

        try(Scanner sc = new Scanner(System.in)){
            
            Stack<Integer> st = new Stack<>();
            Stack<Integer> tem = new Stack<>();

            System.out.print("Enter length of Stack:- ");
            int n = sc.nextInt();

            System.out.println("Enter the element of Stack:- ");
            for(int i=0;i<n;i++){
                st.push(sc.nextInt());
            }

            System.out.print("Enter index at which element to be insert:- ");
            int idx =sc.nextInt();

            while(st.size()>idx){
                tem.push(st.pop());
            }

            System.out.println("Enter the element to be entered");
            st.push(sc.nextInt());

            // again insert element to same stack
            while(!tem.isEmpty()){
                st.push(tem.pop());
            }

            System.out.println(st);
        }
    }
}