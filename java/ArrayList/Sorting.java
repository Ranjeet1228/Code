import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Sorting {
    public static void main(String[] args){

        //Declaration of ArrayList
     ArrayList <Integer>list = new ArrayList<>();

     try(Scanner sc =new Scanner(System.in)){
     
     // prompt the user to enter the size of ArrayList:- 
     System.out.print("Enter size of arraylist:- ");
     int n = sc.nextInt();

     //prompt the user to enter the element of ArrayList:- 
     System.out.println("Enter the element of ArrayList:- ");
     for(int i= 0;i<n;i++){
        list.add(sc.nextInt());
     }

     //sorting in ascending order
     Collections.sort(list);

     System.out.println("in ascending order:- "+ list);

     //for Decending order 
     Collections.sort(list, Collections.reverseOrder());
     System.out.println("In decending order- "+ list);
     
     }
     
    }
    
}
