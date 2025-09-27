package java.Recursion;
import java.util.Scanner;
public class PraisedQ2 {
    public static int pow(int p, int q){
        //base case, if q==0, return 0
        if(q==0) return 1;
        if(q%2==0){
            int c=pow(p,q/2); //find pow(p,q/2)
            return c*c; //multiply both if it q is even
        } else{
            // q is odd then 
            int c=pow(p,q/2);
            return c*c*p;
        }
    }
        public static void main(String[] args){

            //Scanner object to store data
            Scanner sc =new Scanner(System.in);
            //prompt the user to enter p
            System.out.print("Enter p:- ");
            int p=sc.nextInt();
            //prompt the user to enter q
            System.out.print("Enter q:- ");
            int q=sc.nextInt();
            //print the return by recursive function call
            System.out.println("p raised to q :- "+ pow(p,q));
            sc.close(); //to protect memory leakage
        }
    
    
}


/*
 let p=5,q=6
 pow(5,6)=pow(5,6/2)*pow(5,6/2):- 125*125=15625
 pow(5,3)=p*pow(5,1)*pow(5,1):-  5*5*5=125  // 3/2=1
 pow(5,1)=5*pow(5,0)*pow(5,0):- 5*1*1=5
 pow(5,0)=1;
 */
