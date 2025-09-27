import java.util.ArrayList;
import java.util.Scanner;
public class RemoveDuplicate{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        ArrayList <Integer> list = new ArrayList<>(); //Initialisation of ArrayList
        
        //prompt the user to enter the size of ArrayList
        System.out.print("Enter the size of ArrayList:- ");
        int size = sc.nextInt();

        //prompt the user to enter the element of ArrayList
        System.out.println("Enter the element of Arraylist:- ");
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }

        //Remove Duplicate from the ArrayList
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--; //After removing duplicate size decrease by one
            }
            }
        }

        //Print after removing
        System.out.println("After removing:- "+ list);
        }
    
    }
    
}
