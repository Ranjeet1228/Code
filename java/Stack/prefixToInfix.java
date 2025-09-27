import java.util.Scanner;
import java.util.Stack;

public class prefixToInfix {
   public static void main(String[] args) {
    
        try(Scanner sc = new Scanner(System.in)){

         System.out.println("Enter an Expression in form of postFix:- ");
            String str = sc.next();

            Stack <String> st = new Stack<>();

            for(int i = str.length()-1; i>=0; i--){

                char ch= str.charAt(i);
                int ascii = (int) ch;

                if(ascii>=47 && ascii<=57) st.push(""+ch);

                else{
                    String val1 = st.pop();
                    String val2 = st.pop();
                    
                    st.push("(" + val1 +ch+ val2 + ")");
                }
            }
            System.out.println("Expression in infix form:- \n" + st.pop());

        }
    } 
}

/*
Enter an Expression in form of postFix:- 
+3+*528
Expression in infix form:- 
(3+((5*2)+8))
 */