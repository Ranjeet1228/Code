import java.util.*;

public class ReverseKElement {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            Queue<Integer> q = new LinkedList<>();
            Stack<Integer> st = new Stack<>();

            System.out.print("Enter size of Queue:- ");
            int size = sc.nextInt();

            System.out.println("Enter element of Queue:- ");
            for(int i =0; i<size; i++){
                q.add(sc.nextInt());
            }

            System.out.print("Enter the element to be reverse:- ");
            int rev = sc.nextInt();

            int count=rev;
            while(count>0){
                st.add(q.poll());
                count--;
            }

            int time= size-rev;

            while(!st.isEmpty()){
                q.add(st.pop());
            }

            while(time>0){
               
                q.add(q.poll());
                time--;
            }

            System.out.println(q);
        }
    }    
}
