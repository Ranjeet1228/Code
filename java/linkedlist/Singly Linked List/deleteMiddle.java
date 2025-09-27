import java.util.Scanner;

public class deleteMiddle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
           CustomLinkedList ll = new CustomLinkedList();
            System.out.print("Enter size of linkelist:- ");
            int size = sc.nextInt();
            System.out.println("Enter element of linkedlist:- ");
            for(int i=0;i<size;i++){
                ll.add(sc.nextInt());
            }
            ll.deletemiddleEnt();
            ll.display();
        }
    }
}
