import java.util.Scanner;
import java.util.Stack;

public class postfixToInfix {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter an Expression in form of postFix:- ");
            String str = sc.next();

            Stack <String> st = new Stack<>();

            for(int i =0; i<str.length(); i++){

                char ch = str.charAt(i);
                int ascii = (int)ch;

                if(ascii>=47 && ascii<=57) st.push(""+ch);

                else{
                     
                    String val2 = st.pop();
                    String val1 = st.pop();

                    st.push("("+ val1 + ch + val2 +")");
                }
            }

            System.out.println("Expression in form of infix:- \n" + st.pop());
        }
    }
}

/*
Enter an Expression in form of postFix:- 
932*5+2*+
Expression in form of infix:- 
(9+(((3*2)+5)*2))
 */