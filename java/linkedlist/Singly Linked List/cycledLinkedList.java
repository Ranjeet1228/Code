import java.util.Scanner;

public class cycledLinkedList {
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
        }
    }


    // function to check linked list is cycled or not
    public static boolean hasCycle (node head){
        node fast = head;
        node slow = head;
        if(fast == null|| fast.next == null) return false;
        while(fast!= null&& fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the element:- ");
            node ll1= new node(sc.nextInt());
            node ll2 = new node(sc.nextInt());
            node ll3 = new node(sc.nextInt());
            node ll4 = new node(sc.nextInt());
            node ll5 = new node(sc.nextInt());
            ll1.next=ll2;
            ll2.next= ll3;
            ll3.next = ll4;
            ll4.next = ll5;
            ll5.next = ll2;
            System.out.println(" linked is cycled :-   "+ hasCycle(ll1));
            
        }
    }
}
