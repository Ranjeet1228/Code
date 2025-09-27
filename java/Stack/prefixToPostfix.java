import java.util.Scanner;
import java.util.Stack;

public class prefixToPostfix {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter prefix Expression:- ");
            String str = sc.next();

            Stack<String> st = new Stack<>();

            for(int i = str.length()-1; i>=0; i--){
                char ch = str.charAt(i);
                int ascii = (int)ch;

                if(ascii>= 48 && ascii<=57) st.push(""+ch);

                else{
                    String val1 = st.pop();
                    String val2 = st.pop();

                    st.push(val1+val2+ch);
                }
            }
            System.out.println("Expression in postfix form:- " + st.pop());
        }
    }
}

/*
Enter prefix Expression:- 
+3+*528
Expression in postfix form:- 352*8++
 +3+*528
 */