
import java.util.Scanner;

public class deleteNthFromLast {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

            CustomLinkedList ll = new CustomLinkedList();

            // take input about length of linked list
            System.out.print("Enter length of Linked list:- ");
            int n=sc.nextInt();

            // take input using loop from user 
            System.out.println("Enter element of linkedlist:- ");
            for(int i=0;i<n;i++){
                ll.add(sc.nextInt());
            }

            ll.display(); // display the linkelist

            System.out.println("Enter the node which should be delete:- ");
            ll.deleteNthlast(sc.nextInt()); // delete 5 element from last

            ll.display(); // display after deleting
        }
    }
}
