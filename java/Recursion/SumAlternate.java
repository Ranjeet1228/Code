package java.Recursion;
import java.util.Scanner;
public class SumAlternate{

    //Recursive function
    public static int sumDiffalter(int n){

        if(n==1) return 1;//base case

        if(n%2==0){ //for every even number, number is substracted
            return sumDiffalter(n-1)-n;
        }else
        
        { //for odd number number, number is added
            return sumDiffalter(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //prompt the user to Enter n;
        System.out.print("Enter n:- ");
        int n = sc.nextInt();

        //print the result after function call;
        System.out.println("result:- "+ sumDiffalter(n));
        sc.close();
    }
    
}
