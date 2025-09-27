import java.util.ArrayList;
import java.util.Scanner;
public class mergeArrayListM2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        ArrayList <Integer>list1 = new ArrayList<>(); //Initiallization of list1 ArrayList
        ArrayList <Integer>list2 = new ArrayList<>(); //Initiallization of list2 ArrayList
        ArrayList <Integer>merg = new ArrayList<>(); //Initiallization of merg ArrayList

        //prompt the user to enter the size of Arraylist list1 
        System.out.print("Enter size1:- ");
        int size1 = sc.nextInt();

        //promt the user to enter the element  of list1
        System.out.println("Enter the element of size of list1:- ");
        for(int i = 0; i<size1;i++){
            list1.add(sc.nextInt());
        }


        //prompt the user to enter the size2 of list2:- 
        System.out.print("Enter size2:- ");
        int size2 = sc.nextInt();


        //prompt the user to enter element of list2
        System.out.println("Enter the element of list2:- ");
        for(int i = 0 ;i<size2;i++){
            list2.add(sc.nextInt());
        }

        //Merge ArrayList
        merg.addAll(list1); //add all element of list1 into merg
        merg.addAll(list2); //add all element of list2 into merg
        System.out.println("After merging list1 & list2:- "+merg);
        }
    }
}