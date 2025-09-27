package java.Recursion;
import java.util.Scanner;

public class sumArray{
    public static int sum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } 
        //return = subproblem+self work
        return arr[n - 1] + sum(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int n = sc.nextInt();

        // Initialisation of array
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the element of array:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } // Closing brace for the for loop

        // Calculate and print the sum of the array
        System.out.println("Sum of array :- " + sum(arr, n));

        // Close the scanner
        sc.close();
    } // Closing brace for the main method
} // Closing brace for the SumArray class