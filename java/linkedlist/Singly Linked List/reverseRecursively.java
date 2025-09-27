import java.util.Scanner;

public class reverseRecursively {
    public static class node{
        int data;
        node next;
        // constructor
        public node(int data){
            this.data= data;
        }
    }

    // linkedlist class
    public static class linkelist2{
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

        if(head.next== null) return head;

         node headup = reverse(head.next);
         head.next.next = head;
         head.next = null;
        return headup;
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
            node rev = reverse(ll.head);
            display(rev);
        }
    }
}