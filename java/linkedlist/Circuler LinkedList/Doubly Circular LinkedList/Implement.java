import java.util.Scanner;
public class Implement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            DoblyClass<Integer> dl = new DoblyClass<>();
            
            System.out.print("Enter length of linkedList:- ");
            int size = sc.nextInt();

            //Add element in linkedlist:- 
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                dl.add(sc.nextInt());
            }

            System.out.println("Your Doubly Circular Linked List:");
            dl.display();

            //insert element at index:- 
            System.out.print("Enter data and index :- ");
            dl.insert(sc.nextInt(), sc.nextInt());
            dl.display();

        }
    }
}