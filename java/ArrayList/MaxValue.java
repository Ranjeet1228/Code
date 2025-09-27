import java.util.ArrayList;
import java.util.Scanner;

public class MaxValue {
     public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            ArrayList<Integer> list = new ArrayList<>(); //Initiallization of Arraylist 'list'


            //prompt the user to Enter the size of Arraylist
            System.out.print("Enter the size of Arraylist:- ");
            int n = sc.nextInt();
            //prompt the user to enter the element of ArrayList
            System.out.println("Enter the element of ArrayList:- ");
            for(int i = 0;i<n;i++){
                list.add(sc.nextInt());
            }

            //find the max value 
            int max = Integer.MIN_VALUE;
            for(int i = 0;i<list.size();i++){
                if(max<list.get(i)) max = list.get(i);
            }
            
            //Print the max value
            System.out.println("Maximum value in list:- "+ max);
        }
    }
}
