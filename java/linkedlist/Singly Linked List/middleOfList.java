import java.util.Scanner;

public class middleOfList {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            CustomLinkedList ll = new CustomLinkedList();
            
            // enter size of list;
            System.out.print("Enter size of linkedList:- ");
            int size = sc.nextInt();

            // enter the element of linked list
            for(int i=0;i<size;i++){
                ll.add(sc.nextInt());
            }
            //find middle element; // for right element;
            System.out.println("Middle of element is :- "+ll.middleElntLft());
            System.out.println("middle ryt of element "+ ll.middelelntRyt());
        }
    }
}
