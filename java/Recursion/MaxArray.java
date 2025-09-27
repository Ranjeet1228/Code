package java.Recursion;
import java.util.*;
public class MaxArray {

    public static int maxArray(int [] arr, int n){
        if(n==1){
            return arr[0];
        }
        
       return Math.max(arr[n-1],maxArray(arr, n-1));
    }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //prompt the user to enter the size of array
            System.out.print("Enter the size of array:- ");
            int size = sc.nextInt();
            //Initiallization of array
            int[] arr = new int[size];
            //prompt the user to enter the size of array
            System.out.println("Enter the elements of array:- ");
            for(int i= 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("maximum value of array arr is "+ maxArray(arr, size));
            sc.close();
        }
}
