package java.Recursion;
import java.util.Scanner;

public class pelindromeCheck {
    public static String reverse(String s){
        if(s.length()==0) return ""; //base case
        String sh = reverse(s.substring(1))+s.charAt(0);//self work + recursive calling
        return sh; //return value
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            //prompt the user to enter a string
            System.out.print("Enter string:- ");
            String s = sc.nextLine();

            String rev = reverse(s); //reverse a string using recursive function

            if(rev.equals(s)){ //check the result 
                System.out.printf("%s is pelindrome", s);
            } else{
                System.out.printf("%s is not pelindrome", s);
            }
        }
    }
}
