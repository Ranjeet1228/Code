import java.util.Scanner;

public class reverseIteratively {
         static class node{
        int data;
        node next;
        // constructor
        public node(int data){
            this.data= data;
        }
    }

    // linkedlist class
     static class linkelist2{
        node head;
        node tail;
        
        public void add(int val){
            node tem = new node(val);
            if(head== null){
                head = tem;
                tail= tem;
            } else{
                tail.next = tem;
                tail = tem;
            }
        }
    }

    // function to reverse the linkedlist:- 
    public static node reverse(node head){
        node curr=head;
        node prev=null;
        node nextnode = null;
        while(curr!=null){
            nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        return prev;
    }

    // display
    public static void display(node head){
        node tem = head;
        while(tem!= null){
            System.out.print(tem.data+" ");
            tem = tem.next;
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            linkelist2 ll = new linkelist2();
            System.out.print("Enter length of linkedList:- ");
            int size = sc.nextInt();
            
            // add element 
            System.out.println("Enter the element of linkedlist:- ");
            for(int i=0;i<size; i++){
                ll.add(sc.nextInt());
            }
            node head = reverse(ll.head);
            display(head);
        }
    }
}