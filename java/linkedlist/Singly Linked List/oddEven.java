import java.util.Scanner;
public class oddEven {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data= data;
        }
    }
    public static class linkedlist{
        node head;
        node tail;
        public void add(int data){
            node tem = new node(data);
            if(head == null){
                head= tem;
                tail= tem; 
            } else{
                tail.next = tem;
                tail=tem;
            }
        }
    }

    public static void display(node head){
        node tem = head;
        while(tem!= null){
            System.out.print(tem.data+ " ");
            tem= tem.next;
        }
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            linkedlist ll= new linkedlist(); // class to add element of linkedlist

            // enter length of linkedlist
            System.out.print("Enter length of linkedlist:- ");
            int size = sc.nextInt();

            // enter element of linkedlist
            System.out.println("Enter element of linkedlist:- ");
            for(int i=0;i<size ;i++){
                ll.add(sc.nextInt());
            }

            node temp = ll.head;
            node odd = new node(0); // to store odd
            node tem1 = odd;
            node even = new node(0);// to store even;
            node tem2 = even;

            // divide element into odd and even
            while (temp!=null){
                if(temp.data %2== 0){
                    tem2.next = temp;
                    tem2=tem2.next;
                } else{
                    tem1.next = temp;
                    tem1= tem1.next;
                }
                temp=temp.next;
            }

            tem1.next = even.next; // add odd to even

            display(odd.next);
        }
    }
}