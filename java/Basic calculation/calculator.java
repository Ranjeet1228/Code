//Calculator(addition,substraction,division,reminder
import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter operand 1:_ ");//promt to enter first oprand 
        int a= sc.nextInt();
        System.out.print("enter operator:- ");//promt to enter operator
        String ch=sc.next();
        System.out.print("enter operand 2:- ");//promt to enter second operand
        int b= sc.nextInt();
        sc.close();//to avoid memory leak

        switch(ch){
            case "+":System.out.println(a+b); 
            break;
            case "-":System.out.println(a-b);
            break;
            case "*":System.out.println(a*b);
            break;
            case "/":System.out.println(a/b);
            break;
             case "%":System.out.println(a%b);
            break;
            default: System.out.println("invailid");
        }
    }
}
