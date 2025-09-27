package java.Recursion;
import java.util.Scanner;
public class reverseString {

    //recursive function
    static void reverse(String s, int n){
        if(n==0) return; //base case 
        System.out.print(s.charAt(n-1)); //self work
        reverse(s, n-1); //recursive call
    }

    //main function
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            //prompt the user to enter string
            System.out.print("Enter String:- ");
            String s = sc.nextLine();

            //function call to print reverse order
            reverse(s, s.length());
        }
    }
}