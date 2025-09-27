package java.Recursion;
import java.util.Scanner;
public class MaxValueM2 {

    public static int maxArray(int[] arr, int n){
        if(n==1){
            return arr[0];
        }
        int s = maxArray(arr, n-1);
        if(s<arr[n-1]) return arr[n-1];
        else return s;
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter size of array:= ");
            int s = sc.nextInt();
            int[] arr = new int [s];
            System.out.println("Enter element of array:- ");
            for(int i =0; i<s; i++){
                arr[i]= sc.nextInt();
            }
            System.out.println(maxArray(arr, s));
        }
    }
    
}
