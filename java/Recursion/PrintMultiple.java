package java.Recursion;
import java.util.Scanner;
public class PrintMultiple{
    //recursive function to print multiple
    public static void multiple(int num,int k){
        if(k==1){ //base case
            System.out.print(num+" ");
            return;
        }

        //recurcive call
        multiple(num, k-1);

        //print num*k
        System.out.print((num*k)+" ");
        return;
    }

    public static void main(String[] args) {

        //Scanner object to store data
        Scanner sc = new Scanner(System.in);

        //Prompt the user to enter the value of num
        System.out.print("Enter the value of num:- ");
        int num= sc.nextInt();

        //prompt the user to enter the value of k
        System.out.print("Enter the value of k:- ");
        int k = sc.nextInt();

        sc.close(); //to prevent resource leakage

        if(k>0&&num>0){ //for checking the input, input should not be zero and negative.so it should be handled
            multiple(num, k);
        }
        
        else{
            System.out.println("INVALID");
            return;
        }

    }
}