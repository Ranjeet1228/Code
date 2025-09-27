import java.util.Scanner;

public class function {
    public static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
   public static class Node{
        int data;
        Node next;

        // constructor
        public Node(int num){
            data = num;
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
            print(a);

            System.out.println(a.data);
        }
    }
}
