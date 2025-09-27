package java.Recursion;
// print the number upto n by using recursion
import java.util.Scanner;
public class printUpToN {
    public static void printNum(int n){
        if(n==1){
            System.out.println(n);//base case
            return;
        }
        printNum(n-1);//recursive call first

       System.out.println(n);//print the number after recursion
    }
    public static void main(String[] args) {

        //Initialization of Scanner class object to store 
        Scanner sc= new Scanner(System.in);

        //prompt to User to enter the value of n
        System.out.print("Enter n:- ");
        int n=sc.nextInt();
        sc.close(); //to prevent resource leakage

        printNum(n);//call the function

    } 
}
