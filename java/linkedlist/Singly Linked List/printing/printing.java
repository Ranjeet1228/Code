import java.util.Scanner;

public class printing {
    public static class Node{
        int data;
        Node next;

        // constructor
        public Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Eneter the element of Node");
            Node a = new Node(sc.nextInt()); // head Node
            Node b = new Node(sc.nextInt());
            Node c = new Node(sc.nextInt());
            Node d= new Node(sc.nextInt()); // Tail Node
            a.next=b;
            b.next=c;
            c.next =d;

            // printing using loop
            Node tem=a;
            // for(int i=1;i<=4;i++){
            //     System.out.println(i+":- "+tem.data);
            //     tem=tem.next;
            // }
            while(tem!= null){
                System.out.println(tem.data);
                tem= tem.next;
            }
        }
    }
}
