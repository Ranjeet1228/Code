package java.Recursion;
import java.util.Scanner;
public class pRaiseQ {

public static int pow(int p, int q){
    if(q==0){ //base case
        return 1;
    }
    return (pow(p,q-1)*p); //return call with recurcive call and self call
}

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Prompt the user to enter the input
    System.out.print("Enter p:- ");
    int p=sc.nextInt();
    System.out.print("Enter q:- ");
    int q=sc.nextInt();
    sc.close();
    System.out.println(pow(p,q));

    }
}
