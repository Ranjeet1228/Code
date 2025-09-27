package java.Recursion;
import java.util.Scanner;
public class fibonaccirecur {
  
    //print the fibonacci
    public static int fibbo(int n){
        if(n==0||n==1){//In case of 0 and 1 return n;   
            return n;
        }
        int pre1=fibbo(n-1); // recurcive call f(n-1)
        int pre2=fibbo(n-2);//Recursive call f(n-2)
        int ans= pre1+pre2;
        return ans;
    }

    //Main function
    public static void main(String[] args){
        //create scanner class object to store a new value
        try(Scanner sc=new Scanner(System.in)){

        //prompt the user to enter the value of n
        System.out.print("Enter n:- ");
        int n=sc.nextInt();

        //print the number upto n series using loops
        for( int i=0;i<=n;i++){
            System.out.println(fibbo(i)); //for printing fibonacci upto nth term
        }
    }
    }
}
