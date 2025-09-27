package java.Recursion;
import java.util.Scanner;
public class removeAllOccurence {

    //recurcive function to remove occurrence
    public static String remove(String s,int n, char t){
        String sh;
        if(n==0) return ""; //base case
        if(s.charAt(n-1)!=t){ //self work and recursive call
            sh=remove(s, n-1, t)+s.charAt(n-1);
        } else{
            sh=remove(s, n-1, t);
        }
        return sh; //returning value

    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        //prompt the user to enter the string
        System.out.print("Enter string:- ");
        String s = sc.nextLine();

        //prompt the user to enter target
        System.out.print("Enter target char:- ");
        char t = sc.next().charAt(0);

        //print the result
        System.out.println(remove(s, s.length(), t));
        }
    }
}
