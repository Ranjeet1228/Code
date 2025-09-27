package java.Recursion;
import java.util.Scanner;

public class subsequenceM2 {
    public static void printSSQ(String s, String currentAns){
        if(s.length()==0){
            System.out.println(currentAns);
            return;
    }
    char curr = s.charAt(0);
    String rem = s.substring(1);
    printSSQ(rem, currentAns+curr);
    printSSQ(rem, currentAns);
}
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            //prompt the user to enter the string
            System.out.print("Enter string:- ");
            String s = sc.nextLine();

            printSSQ(s, "");
        }
    }
    
}
