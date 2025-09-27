package java.Recursion;
import java.util.Scanner;
public class printNTo1 {

//Recursive function to print the number in decreasing order
public static void  print(int n){
    if(n==1){ //base case
        System.out.print(1);
        return;
    }
    //print the value of n first and then call recursive function
    System.out.print(n+" ");
    print(n-1);
}

    //Main function
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       //Prompt the user to Enter the input
       System.out.print("Enter n:- ");
       int n=sc.nextInt();

       print(n);//call the function

       sc.close();

    }
}
