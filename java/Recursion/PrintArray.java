package java.Recursion;
import java.util.Scanner;
public class PrintArray {


//A recursive function to print the array elements
 public static void printArray(int []arr,int n){
    if(n==1){ //base case
        System.out.print(arr[n-1]+" ");
        return;
    }

    printArray(arr, n-1);//recusive call
    System.out.print(arr[n-1]+" "); //self work
 }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      //prompt the user to enter the size of array
      System.out.print("Enter the size of the array:- ");
      int n = sc.nextInt();

      //Initiallization of new array
      int[] arr = new int[n];

      // Taking input from the user
      for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
      }

      printArray(arr, n);//Recursive function call

      sc.close();//to prevent resource leakage
  }  
}
