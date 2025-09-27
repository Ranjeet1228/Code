import java.util.Scanner;

public class LengthNode {

    // method to find the length of Node
    public static int length(Node head){
        int count=0;
        while(head!= null){
            count++;
            head = head.next;
        }
        return count;
    }

    // class 
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
            System.out.println(length(a));
        }
    }
}
