import java.util.Scanner;

public class implement {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            // Create object of the inner Linkedlist class
            singlycirLinkelist cl = new singlycirLinkelist();

            // take input of size 
            System.out.print("Enter size of linked list: ");
            int size = sc.nextInt();

            // take input from user
            System.out.println("Enter elements of linked list:");
            for (int i = 0; i < size; i++) {
                cl.add(sc.nextInt());
            }

            // display the list
            System.out.println("Befor inseting:- ");
            cl.display();

            
            cl.insert(12,13);
            System.out.println("After inserting:- ");
            cl.display();

            //delete
            System.out.print("Eneter the index which have to be delete:- ");
            cl.delete(sc.nextInt());
            System.out.println("After deleting:-");
            cl.display();
        }
    }
}
