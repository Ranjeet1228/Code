import java.util.Scanner;

public class isPelindrom {
     static class node{
        int data;
        node next;

        // constructor
        public node(int data){
            this.data = data;
        }
    }

    static class linkedlist{
        node head;
        node tail;
         void add(int data){
            node tem = new node(data);
            if(head == null){
                head = tem;
                tail = tem;
            } else{
                tail.next=tem;
                tail= tem;
            }
        }
    }

    // to check pelindrom
    static boolean ispelindrom(node head){
        if(head==null|| head.next==null) return false; 
        node midnode =midpoint(head);
        
        if(midnode==head){
            if(head.data == head.next.data) return true;
            else return false;
        }
        // reverse the node after mid
        midnode.next = reverse(midnode.next);
        node tem=head;
        node curr = midnode.next;
        while(curr!=null){
            if(tem.data!=curr.data) return false;
            curr=curr.next;
            tem=tem.next;
        }

        return true;
    }

    // to find middle
    static node midpoint(node head){
        node slow = head;
        node fast = head;
        while(fast.next!=null&& fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    // reverse node;
    static node reverse(node head){
        if(head.next ==null) return head;
        node newnode = reverse(head.next);
        head.next.next = head;
        head.next=null;
        return newnode;
    }

    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            linkedlist ll = new linkedlist();

            System.out.print("Enter size of linked list:- ");
            int size = sc.nextInt();

            // eneter size of linkedlist
            System.out.println("Enter element of linkedlist:- ");
            for(int i=0;i<size;i++){
                ll.add(sc.nextInt());
            }
            boolean check = ispelindrom(ll.head);
            System.out.println(check);
        }
    }
}
