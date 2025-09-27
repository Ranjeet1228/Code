import java.util.Scanner;
import java.util.Stack;

public class prefix {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter an Expression:- ");
            String str = sc.next();

            Stack<String> st = new Stack<>();
            Stack<Character> op = new Stack<>();

            for(int i =0; i<str.length(); i++){

                char ch = str.charAt(i);
                int ascii = (int)ch;

                if(ascii>= 48 && ascii<= 57) st.push(String.valueOf(ch));

                else if(op.isEmpty()) op.push(ch);
                else{
                    if(ch =='+' || ch == '-'){

                        String val2 = st.pop();
                        String val1 = st.pop();
                        char opr = op.pop();
                        st.push(opr+val1+val2);

                    }
                    else if((ch=='*' || ch == '/') && (op.peek()== '*' || op.peek() == '/')){

                        String val2 = st.pop();
                        String val1 = st.pop();
                        char opr = op.pop();
                        st.push(opr+val1+val2);
                            
                    }

                    op.push(ch);
                }
            }

            while(!op.isEmpty()){

                String val2 = st.pop();
                String val1 = st.pop();
                char opr = op.pop();
                st.push(opr+val1+val2);
            }

            System.out.println("Prefix:- "+ st.pop());
        }
    }

}

/*
Enter an Expression:- 
3+5*2+8
Prefix:- +3+*528

 */