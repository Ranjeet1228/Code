import java.util.Scanner;

public class maxTwinSum {
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

   // max twin sum
   static int maxsum(node head){
    if(head==null){ // if no element is present
        System.out.println("no element");
        return -1;
    } 
    else if(head.next==null){ // if only one elementis present
        return head.data;
    }
    else if(head.next.next==null){ // if only two element is present
        return head.data+head.next.data;
    }

    node midnode = midpoint(head);// find the midpoint
    midnode.next= reverse(midnode.next); // reverse the node of after midpoint

    node right=midnode.next;
    node left = head;

    int max =Integer.MIN_VALUE;
    while(right!=null){
        int val = left.data+right.data;
        if(val>max) max=val;
        
        right=right.next;
        left=left.next;
    }

    midnode.next=reverse(midnode.next); // again reverse to get original node;

    return max;
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
            int max= maxsum(ll.head);
            System.out.println("maximum twin sum:- "+ max);
           
        }
    }
}