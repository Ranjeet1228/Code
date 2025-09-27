import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){

        //prompt to user to enter the last Integer upto which series to be find
        System.out.print("Enter the last number:- ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        while(b<=n){
            System.out.print(b+" ");
            int temp= a+b;
            a=b;
            b=temp;

        }
    }
    }
    
}
