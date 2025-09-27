import java.util.LinkedList;
import java.util.Queue;
public class basicSTL {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();

        // add element
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        System.out.println(qu);

        // remove
         int n= qu.remove();
        System.out.println(qu);
        System.out.println(n);

        // get top element
        System.out.println(qu.element());
        System.out.println(qu.peek());

        System.out.println("Size:- "+ qu.size());

        // to check is empty
        System.out.println("Queue is empty:- "+ qu.isEmpty());
    }
}
