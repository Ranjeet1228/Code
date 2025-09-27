package java.Recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class subsequence {
    //recursive function to find subsequence
    public static ArrayList<String>getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        //base case;
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0); //store first character of string
        ArrayList<String> smallAns = getSSQ(s.substring(1)); //recursive call
        for(String ss: smallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            //prompt the user to enter the string
            System.out.print("enter string:- ");
            String s = sc.nextLine();
            
            //print the result
            System.out.println("Subsequence:- "+getSSQ(s));
        }
    }
    
}
