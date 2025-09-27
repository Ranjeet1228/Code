package java.Recursion;
import java.util.Scanner;
public class removeAllOccurenceM2{


    //Recursive function to remove target element
   /*  public static String removeTarget(String s,int i, char t){
        String sh;
        if(i==s.length()){
            return "";
        }
        if(s.charAt(0)!=t){
            sh = s.charAt(0)+removeTarget(s.substring(i+1), 0, t);
        }
        else sh = removeTarget(s.substring(i+1),0, t);
        return sh;
    }*/


    //another methode
    static String removeTarget(String s, char t){
        if(s.length()==0){
            return "";
        }
        String sh;
        if(s.charAt(0)!=t){
            sh = s.charAt(0)+removeTarget(s.substring(1), t);
        } else{
            sh = removeTarget(s.substring(1), t);
        }
        return sh;
    }

    //Main function
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            
            //prompt the user to enter string
            System.out.print("Enter String:- ");
            String s = sc.nextLine();

            //prompt the user to enter removing element
            System.out.print("Enter removing element:- ");
            char t = sc.next().charAt(0);

            //print the result
            System.out.println("After removing '"+t+"' string '"+s+"':- "+removeTarget(s, t));

        }
    }
}