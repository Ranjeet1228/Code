import java.util.Scanner;
import java.util.Stack;

public class postfixEvalution {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter an expression in Postfix:- ");
            String str = sc.next();

            Stack<Integer> num = new Stack<>();

            for(int i =0; i<str.length(); i++){

                char ch = str.charAt(i);
                int ascii = (int)ch;

                if(ascii>=48 && ascii<= 57) num.push(ascii-48);

                else{

                    int val2 = num.pop();
                    int val1 = num.pop();

                    switch(ch){
                        case '+' -> num.push(val1 + val2);
                        case '-' -> num.push(val1 - val2);
                        case '*' -> num.push(val1 * val2);
                        case '/' -> num.push(val1 / val2);
                    }
                }

            }
            System.out.println("Ans:- "+ num.pop());
        }
    }
}

/*
Enter Postfix:- 
932*5+2*+
Ans:- 31
 */