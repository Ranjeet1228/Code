
import java.util.Scanner;


public class StrongNumber {
    //function to find the factorial
    public static int fact(int n){
        int s=1;
        //find factorial of number
        for(int i=1;i<=n;i++){
            s*=i;
        }
        return s;
    }
    
    //Main function
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){

        //promt to enter the input
        System.out.print("Enter n:- ");
        int n=sc.nextInt();
        sc.close(); //to prevent resource leakage
        
        int temp=n; //to save the value of n for further use

        int sumfac=0;

        while(temp>0){
            int rem=temp%10;
            sumfac+=fact(rem);
            temp/=10;
        }

        if(sumfac==n){
            System.out.println("Strong number");
        } else{
            System.out.println("INVALID");
        }
    }
}
    
}
