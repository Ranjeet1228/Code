import java.util.Scanner;
import java.util.Stack;

public class minBalancedNum {


     public static int MinBalance(String str){

        int num=0;

        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==')'){

                if(st.isEmpty()) num++;

                else st.pop();
            }

            if(str.charAt(i)=='('){
                st.push('(');
            }
        }
        
        num+=st.size();
        return num;
    }

   public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter String:- ");
        String str = sc.next();


        System.out.println("Minimum number to remove:- "+ MinBalance(str));
    }
   } 
}
