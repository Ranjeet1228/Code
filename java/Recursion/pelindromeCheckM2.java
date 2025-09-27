package java.Recursion;
import java.util.Scanner;

public class pelindromeCheckM2 {

    //recursive function to check the string is pelindrome or not
    public static boolean checkPelindrome(String s, int i, int n){
        if(i>=n) return true;//base case

        //self work + recursive work
        boolean check;
        if(s.charAt(i)==s.charAt(n-1)){
            check= checkPelindrome(s, i+1, n-1); //if condition is satisfied then move ahead
        }else{
            check = false; //if condition is not satisfied then it will not be true
        }
        return check;
    }
    //main function
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            //prompt the user to enter string
            System.out.print("Enter String:- ");
            String s = sc.nextLine();

            //check the result 
            if(checkPelindrome(s, 0, s.length())){
                System.out.printf("%s is pelindrom",s);
            }else{
                System.out.printf("%s is not pelindrom",s);
            }
            
        }
    }
}