import java.util.ArrayList;
import java.util.Scanner;
public class Swaping {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
        ArrayList <Integer>list = new ArrayList<>(); //Initialisation of ArrayList

        //prompt the user to enter the size of arrayList
        System.out.print("Enter the size of ArrayList:- ");
        int size = sc.nextInt();

        //prompt the user to enter the element of ArrayList
        System.out.println("Enter the element of ArrayList:- ");
        for(int i = 0; i<size ;i++){
            list.add(sc.nextInt());
        }
        int i=0;
        int j = size-1;
        while(i<j){
            int temp= list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
        System.out.println(list);
    }

    }
}
