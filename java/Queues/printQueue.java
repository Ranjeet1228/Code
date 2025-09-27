import java.util.*;
public class printQueue {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            Queue<Integer> q = new LinkedList<>();

            System.out.println("Enter size of Queues:- ");
            int size = sc.nextInt();

            System.out.println("Enter element of Queue:- ");
            for(int i =0; i<size; i++){
                q.add(sc.nextInt());
            }

            Queue<Integer> ans = new LinkedList<>();
            for(int i =0; i<size; i++){
                int n = q.remove();
                ans.add(n);
                System.out.print(n+" ");
            }

            while(!ans.isEmpty()){
                q.add(ans.poll());
            }

        }
    }
}
