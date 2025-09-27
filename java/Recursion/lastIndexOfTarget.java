package java.Recursion;
import java.util.Scanner;
public class lastIndexOfTarget {

    //recursive function 
    public static int lastIndex(int[] arr, int n,int tar){
        if(n==0){
            return -1;
        }
        if(arr[n-1]==tar) return n-1;
        return lastIndex(arr, n-1, tar);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            //prompt the user to enter the size of array
            System.out.print("Enter size of array:-  ");
            int s =sc.nextInt();

            //Initiallisation of array 
            int[] arr = new int [s];

            //prompt the user to enter element of array
            System.out.println("Enter element of array:- ");
            for(int i=0;i<s;i++){
                arr[i]= sc.nextInt();
            }
            
            //Enter target
            System.out.print("Enter target:- ");
            int tar= sc.nextInt();

            //print the last index of target
            System.out.println("Last index of target:- "+lastIndex(arr, s, tar));
        }
    }
}
