import java.util.Scanner;
import java.util.Stack;

public class prefixEvalution {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter number in prefix form:- ");
            String str = sc.next();

            Stack<Integer> num = new Stack<>();

            for(int i = str.length()-1; i>=0; i--){
                char ch = str.charAt(i);
                int ascii = (int) ch;

                if(ascii>= 48 && ascii<=57) num.push(ascii - 48);
                else{
                    int val1 = num.pop();
                    int val2 = num.pop();
                    
                    switch(ch){
                        case '+' -> num.push(val1 + val2);
                        case '-' -> num.push(val1 - val2);
                        case '*' -> num.push(val1 * val2);
                        case '/' -> num.push(val1 / val2);
                    }
                }
            }

            System.out.println("Answere :- "+ num.pop());
        }
    }
}
/*
 Enter number in prefix form:- 
+9*+*3252
Answere :- 31
 */