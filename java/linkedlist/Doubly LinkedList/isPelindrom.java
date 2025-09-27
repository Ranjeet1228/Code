import java.util.Scanner;

public class isPelindrom {
    static boolean checkPelindrom(DublyLinkedList dl){

       DublyLinkedList.node tem =  dl.head;
       DublyLinkedList.node fast = dl.head;
       if(tem.next==null||tem.data== tem.next.data) return true;
       while(tem.next !=null){
        tem = tem.next;
       }
       while(fast!=tem){
        if(fast.data!= tem.data) return false;
        fast= fast.next;
        tem = tem.prev;
       }
       return true;
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            DublyLinkedList dl = new DublyLinkedList();
            // enter size
            System.out.print("Enter length of linkedlist:- ");
            int size = sc.nextInt();

            // enter element of linkedlist
            System.out.printf("Enter %d element of LinkedList:- \n",size);
            for(int i=0;i<size;i++){
                dl.add(sc.nextInt());
            }
            System.out.println(checkPelindrom(dl));

            //check pelindrom;
        }
    }
}
