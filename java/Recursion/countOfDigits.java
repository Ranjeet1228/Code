package java.Recursion;
import java.util.Scanner;
public class countOfDigits {
    //recursive function
    public static int SOD(int n){
        if(n/10==0){ //base case
            return 1;
        }
       int c= SOD(n/10);//recusive call
        return c+1; //self work with return call
        }
        //main function
        public static void main(String[] args){
            try(Scanner sc= new Scanner(System.in)){
            //prompt the user to enter n
            System.out.print("Enter n:- ");
            int n=sc.nextInt();
            System.out.println(SOD(n));
            }
        }
}
