import java.util.Scanner;
import java.util.Stack;
public class MoveStack {
   public static void main(String[] args){
    
    try(Scanner sc = new Scanner(System.in)){

    Stack<Integer> st = new Stack<>();
    Stack<Integer> temp = new Stack<>();
    Stack<Integer> revs = new Stack<>();

        System.out.print("Enter length of stack:- ");
        int n = sc.nextInt();

        //enter element
        System.out.println("Enter element of Stack:- ");
        for(int i=0;i<n;i++){
            st.push(sc.nextInt());
        }

        System.out.println(st);

        // Move one stack into another
        while(!st.isEmpty()){
            temp.push(st.pop());
        }

        while(!temp.isEmpty()){
            revs.push(temp.pop());
        }

        // print second stack
        System.out.println(revs);
    }
   } 
}
