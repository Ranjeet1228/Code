package java.Recursion;
import java.util.Scanner;
public class sumSubset {
    public static void printsum(int[] arr,int c,int i){
        if(i==arr.length){ //base case;
            System.out.println(c); //print value of c
            return;
        }
         
        int cur = arr[i];
        printsum(arr, c+cur, i+1); // add c
        printsum(arr, c, i+1); //leave c
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            //prompt the user to enter size of array:
            System.out.print("Enter size of array:- ");
            int s = sc.nextInt();

            int[] arr = new int[s]; //Initiallisation of array

            //prompt the user to enter the element of array
            System.out.println("Enter element of array:- ");
            for(int i =0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }

            printsum(arr, 0, 0); //function call

        }
    }
}