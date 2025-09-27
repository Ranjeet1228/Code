import java.util.Scanner;
import java.util.Stack;


public class BalancedString {

static boolean isBalance(String str){

    Stack<String> st = new Stack<>();


    for(int i=0;i<str.length();i++){
                
                if(str.charAt(i)=='(') st.push("(");


                if(str.charAt(i)==')'){

                    if(st.isEmpty()){
                        return false;
                    } 
                    else{
                        st.pop();
                    }
                }
            }
            
            return st.isEmpty();
}

    public static void main(String[]  args){
        try(Scanner sc = new Scanner (System.in)){

            System.out.print("Enter a String:- ");
            String str = sc.next();

            System.out.println("IS balanced string:- "+ isBalance(str));

        }
    }
}  