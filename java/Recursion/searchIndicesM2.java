package java.Recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class searchIndicesM2 {

    //ArrayList Recursive function to store target indices:-  
    public static ArrayList<Integer>list(int[] arr, int n, int t, ArrayList<Integer>list){
        
        if(n==0) return list; //base case

        list(arr, n-1, t, list); //Recursion call

        if(arr[n-1]==t){ //self work
            list.add(n-1);
        }
        return list;
    }

    //Main function
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            //Prompt the user to enter the size of array
            System.out.print("Enter size of array:- ");
            int n = sc.nextInt();

            //Initiallisation of array
            int[] arr = new int [n];

            //prompt the user to enter the element of array
            System.out.println("Enter the element of array:- ");
            for(int i =0;i<n;i++){
                arr[i]= sc.nextInt();
            }

            //Enter target
            System.out.print("Enter target value:- ");
            int tar = sc.nextInt();

            ArrayList <Integer>list = new ArrayList<>(); //ArrayList Initiallisation 


            //print the result
            System.out.println("indices:- "+ list(arr, n, tar, list) );

        }
    }
}
