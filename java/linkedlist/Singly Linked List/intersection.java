public class intersection {
    public static class Node{
        int data;
        Node next;
        // condtructor
        public Node(int data){
            this.data= data;
        }
    }
    public static void main(String[] args){
        Node a= new Node(11);
        Node b= new Node(12);
        Node c= new Node(13);
        Node d= new Node(14);
        Node A = new Node(15);
        Node B= new Node(9);
        a.next=b;
        b.next= c;
        c.next=d;
        A.next= B;
        B.next=b;
    }
}
