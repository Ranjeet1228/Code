package java.Recursion;
import java.util.Scanner;

public class searchAllIndexes {

    //function to print the indices of target value
    public static void printIndices(int[] arr,int n, int t){
        if(n==0) return;
        printIndices(arr, n-1, t);
        if(arr[n-1]==t){
            System.out.print((n-1)+" ");
        }

    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            //prompt the user to enter the size of array
            System.out.print("Enter the size of array:- ");
            int n = sc.nextInt();

            //Initiallisation of array
            int [] arr = new int[n];

            //prompt the user to enter element of array
            System.out.println("Enter element of array:- ");
            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }

            //prompt the user to enter the target value
            System.out.print("Enter the value of target:- ");
            int tar = sc.nextInt();

            //function call to print the value
            printIndices(arr, n, tar);
            
        }
    }
    
}
