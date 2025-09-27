package java.Recursion;
import java.util.Scanner;

public class reverseStringM3 {
    public static String reverse(String s){
        if(s.length()==0) return "";
        String sh = reverse(s.substring(1))+s.charAt(0);
        return sh;
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            //prompt the user to enter a string
            System.out.print("Enter string:- ");
            String s = sc.nextLine();
            
            //print the result 
            System.out.println(reverse(s));
        }
    }
}