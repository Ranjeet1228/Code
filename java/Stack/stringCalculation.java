import java.util.Scanner;
import java.util.Stack;

public class stringCalculation {
   public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){

        System.out.println("Enter an String:- ");
        String str = sc.next();
        
        Stack <Integer> num = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0; i<str.length(); i++){

            char ch= str.charAt(i);
            int ascii = (int)ch;

            if(ascii>=48 && ascii<=57) num.push(ascii-48);
            else if(op.isEmpty()) op.push(ch);

            else {

                

                if(ch=='+'|| ch=='-'){

                    int val2= num.pop();
                    int val1= num.pop();
                    char optr= op.pop();

                    switch(optr){
                        case '+' -> num.push(val1 + val2); // using arrow in switch condition do not require break statement
                        case '-' -> num.push(val1 - val2);
                        case '*' -> num.push(val1 * val2);
                        case '/' -> num.push(val1 / val2);
                    }
                    op.push(ch);
                }
                else if(ch=='*' || ch =='/'){

                    if(op.peek()== '*'|| op.peek()== '/'){

                        int val2= num.pop();
                        int val1= num.pop();
                        char optr= op.pop();

                        if(optr =='*') num.push(val1*val2);
                        else if(optr == '/') num.push(val1/val2);
                    }
                    op.push(ch);
                }

                
            }
        }

        // calculate the rest operation left in stack
        while(!op.isEmpty()){

            int val2 = num.pop();
            int val1 = num.pop();
            char optr = op.pop();

            switch(optr){
                case '+' -> num.push(val1 + val2);
                case '-' -> num.push(val1 - val2);
                case '*' -> num.push(val1 * val2);
                case '/' -> num.push(val1 / val2);
            }
        }

        System.out.println("Ans = "+ num.peek());
    }
   } 
}