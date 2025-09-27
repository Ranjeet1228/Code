import java.util.Scanner;
public class DecimalToBinary {

    public static void Binary(int n){
        if(n==1){ //Base case
            System.out.print(1);
            return;
        }
        Binary(n/2); //recurcive call
        System.out.print(n%2); //self work
    }
    public static void main(String[] args) {
       try(Scanner sc= new Scanner(System.in)){

        
        //prompt the user to Enter the input
        System.out.print("Enter decimal digit:- ");
        int n= sc.nextInt();
 
         if(n==0){
             System.out.println(1);
            }else{
             //call the function 
             Binary(n);
            }
        }
    }
    
}
