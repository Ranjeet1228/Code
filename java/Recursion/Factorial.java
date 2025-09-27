package java.Recursion;
import java.util.Scanner;
public class Factorial {
 
    //function to find the factorial
    public static int factorial(int n){
        if(n<=0){ //base case 0!= 1, 1!=1
            return 1;
        }
        int fnm1=factorial(n-1); //Sub problems or recursive call
        return n*fnm1;
    }

    //Main fuction 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //Scanner class object to store the value
        
        int n;
        
        //do while loop handle the input that only non negative number is allowed;
        do { 
            //prompt the user to enter the value of a number whose factorial is to be find
            System.out.print("Enter n:- ");
            n=sc.nextInt();
            if(n<0){
                System.out.println("Invalid, Enter non-negative number ");
            }
        } while (n<0);

        //find the factorial of a number and print it 
        System.out.println("Factorial of "+n+":- "+ factorial(n));
        sc.close();
    }
}
