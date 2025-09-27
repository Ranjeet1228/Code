import java.util.Scanner;

public class RemoveDuplicate {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
        }
    }

    public static class linkelist{
        node head;
        node tail;
        public void add(int data){
            node tem = new node (data);
            if(head== null){
                head = tem;
                tail = tem;
            } else{
                tail.next = tem;
                tail = tem;
            }
        }

        public void deleteDuplicate(){
            node tem = head;
            while(tem!=null&& tem.next != null){
                if(tem.data==tem.next.data){
                    tem.next = tem.next.next;
                } else
                tem = tem.next;
            }
        }
    }

    public static void display(linkelist ll){
        node tem =ll.head;
        while(tem != null){
            System.out.print(tem.data+" ");
            tem = tem.next;
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            linkelist ll = new linkelist();
            System.out.print("Enter lenght of linkelist:- ");
            int size = sc.nextInt();

            // enter element
            System.out.println("Enter the element of linkedlist:- ");
            for(int i=0;i<size;i++){
                ll.add(sc.nextInt());
            }

            //remove duplicate
            ll.deleteDuplicate();
            display(ll);
        }
    }
}