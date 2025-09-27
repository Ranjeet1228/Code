package java.Recursion;
import java.util.Scanner;
public class reverseStringM2 {

    //Reverse a String by recursive string
    public static String reverse(String s, int n){
        if(n==0) return ""; //base case
        String sh = s.charAt(n-1)+ reverse(s, n-1); // self work + recursive call
        return sh; //retutning value
    }
    //Main function
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            //prompt the user to enter a string
            System.out.print("Enter string:- ");
            String s = sc.nextLine();
            
            //print the result 
            System.out.println(reverse(s, s.length()));
        }
    }
    
}
