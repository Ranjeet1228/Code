package java.Recursion;
import java.util.Scanner;

public class TargetCheck {

    //Recurcive function to find array contain number  or not;
    public static boolean target(int [] arr, int n, int tar){
         
        if(n==1){ //base case
            boolean s = false;
            if(tar==arr[0]){
                 s= true;
            }
            return s;
        }

        boolean s = target(arr, n-1, tar);// recursive call

        if(s==true) s = true; //self work: if boolean is already present it means target is already found
        else if(s== false){ //if boolean is false it means number is not found before 
            if(tar == arr[n-1]) return true;// if number get found boolean expression become true
        }
        return s;
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

            //print the result
            System.out.println("item contain:- "+ target(arr, s, t));
            
        }
    }
    
}
