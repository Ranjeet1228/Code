import java.util.ArrayList;
import java.util.Scanner;
public class SwapingUsingFunction {

    //function to reverse;
    public static void reverse(ArrayList<Integer>list){
        int i = 0;
        int j = list.size() - 1;
        while(i<j){
        Integer temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j,temp);
        i++;
        j--;
        }

    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        ArrayList <Integer>list = new ArrayList<>();
        
        //prompt the user to enter the size of ArrayList
        System.out.print("Enter the size of ArrayList:- ");
        int n = sc.nextInt();
        
        //prompt the user to ente the element of ArrayList
        System.out.println("Enter the element of ArrayList:- ");
        for(int i= 0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Before:- "+list);
        reverse(list);
        System.out.println("After "+ list);
        }
    }
}
