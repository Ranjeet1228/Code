package java.Recursion;
import java.util.Scanner;

public class SumOfDigits {
    
    //function to find the sum of digit
    public static int Sum(int n){
        if(n/10==0){ //base case
            return n;
        }
        return Sum(n/10)+(n%10); // return stetement with recursive call and self work
        
    }
    public static void main(String[] args) {
        //create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        //Prompt the user to enter  digit
        System.out.print("Enter the digit:- ");
        int digit=sc.nextInt();

        sc.close();// to protect the scanner class to protect the resource
        
        System.out.print("The sum of digits "+digit+":- "+ Sum(digit));
    }
    
}
