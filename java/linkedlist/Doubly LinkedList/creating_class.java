import java.util.Scanner;
public class creating_class {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            DublyLinkedList dl = new DublyLinkedList();
            
            // enter length of linkedlist
            System.out.print("Enter length:- ");
            int size = sc.nextInt();

            //enter element 
            System.out.println("Enter element:- ");
            for(int i=0;i<size;i++){
                dl.add(sc.nextInt());
            }

            dl.display(dl.head);

            // add at nth index

            System.out.print("Enter the number to add:- ");
            int num = sc.nextInt();

            System.out.print("Enter index to add:- ");
            int idx = sc.nextInt();

            dl.insert(num,idx);
            dl.display(dl.head);

            //delete
            System.out.print("Enter the idx which is to be delete:- ");
            dl.delete(sc.nextInt());
            dl.display(dl.head);
        }
    }
}
