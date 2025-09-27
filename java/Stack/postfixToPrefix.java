import java.util.Scanner;
import java.util.Stack;

public class postfixToPrefix {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter an expression in Postfix form:- ");
            String str = sc.next();

            Stack<String> st = new Stack<>();

            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                int ascii = (int)ch;

                if(ascii >=48 && ascii <= 57) st.push(""+ch);

                else{
                    String val2 = st.pop();
                    String val1 = st.pop();
                    st.push(ch + val1 + val2);
                }
                
            }

            System.out.println("Expression in prefix:- " + st.pop());
        }
    }
}
