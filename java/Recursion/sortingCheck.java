package java.Recursion;
import java.util.Scanner;
public class sortingCheck {

    //Recursive function to check the array is sorted or not
    public static boolean isSorting(int[] arr, int n){
        if(n==arr.length - 1) return true; //base case
        if(arr[n]>arr[n+1])return false; //self work
        return isSorting(arr, n+1); //recursive call
    }

    //Main function
    public static void main(String[] args) {
        //Initiallisation of Scanner object to store element
        try(Scanner sc = new Scanner(System.in)){

            //prompt the user to enter the size of array
            System.out.print("enter size of array:- ");
            int n = sc.nextInt();

            int[] arr = new int[n]; //Initiallisation of array

            //prompt the user to enter the element 
            System.out.println("Enter element of array:- ");
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }

            //check the element is sorted or not
            System.out.println("array is sorted:- "+isSorting(arr, 0));

        }
    }
}
    

