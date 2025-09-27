import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverseQueue{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            Stack<Integer> st = new Stack<>();

            Queue<Integer> q = new LinkedList<>();

            System.out.print("Enter the size of Queue:- ");
            int size = sc.nextInt();

            System.out.println("Enter element of Queue:- ");
            for(int i =0; i<size; i++){
                q.add(sc.nextInt());
            }

            while(!q.isEmpty()){
                st.add(q.remove());
            }

            while(!st.isEmpty()){
                q.add(st.pop());
            }
            System.out.println(q);
        }
    }
}    