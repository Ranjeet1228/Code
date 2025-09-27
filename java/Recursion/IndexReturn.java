package java.Recursion;
import java.util.Scanner;

public class IndexReturn {

    // return index of target if it is present otherwise return -1
    public static int indexSearch(int [] arr, int n, int tar){
        if(n==0) return -1;
        if(arr[n-1]==tar) return n-1;
        return indexSearch(arr, n-1, tar);

    }
     public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            //prompt the user to enter the size of array
            System.out.print("Enter size of array:= ");
            int s = sc.nextInt();

            int[] arr = new int [s]; //Initiallisation of array

            //prompt the user to enter the size of array
            System.out.println("Enter element of array:- ");
            for(int i =0; i<s; i++){
                arr[i]= sc.nextInt();
            }

            //prompt the user to enter the target value
            System.out.print("Enter targer value:- ");
            int t = sc.nextInt();

            //print the index
            System.out.println("index at which target is present:- "+ indexSearch(arr, s, t));
            
        }
    }
}