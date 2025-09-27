import java.util.Scanner;

public class twoSum {

    static DublyLinkedList sum(DublyLinkedList dl,int tar){
        boolean check = false;

        DublyLinkedList res = new DublyLinkedList();

        DublyLinkedList.node left = dl.head;
        DublyLinkedList.node right = dl.tail;
        while( left != right){
            if( left.data + right.data > tar) right = right.prev;

            if( left.data + right.data < tar ) left = left.next;

            if( left.data+right.data==tar ){
                res.add ( left.data );
                res.add ( right.data );
                check = true;
                break;
            }
        }

        if(!check){
            System.out.println("Element not found");
            dl.add( Integer.MIN_VALUE );
        }
        return res;
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            DublyLinkedList dl = new DublyLinkedList();
            
            // enter size
            System.out.print("Enter length of linkedlist:- ");
            int size = sc.nextInt();

            // enter element of linkedlist
            System.out.printf("Enter %d element of LinkedList:- \n",size);
            for(int i = 0;i < size; i++){
                dl.add(sc.nextInt());
            }
           

            System.out.print("Enter target value:- ");
            DublyLinkedList result = sum(dl , sc.nextInt());
            result.display();
        }
    }
}
