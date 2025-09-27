package java.Recursion;
import java.util.Scanner;

public class frogJump {
    public static int best(int[] h, int i){
        if(i==h.length-1) return 0; //;base case;

        //if frog jump 1 step
        int op1 =Math.abs(h[i]-h[i+1])+ best(h, i+1);
        if(i==h.length-2) return op1;

        //if frog jump 2 step
        int op2 = Math.abs(h[i]- h[i+2])+best(h, i+2);
        
        return Math.min(op1,op2);//return min of op1, op2
    }
     
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            //prompt the user to enter the size of array
            System.out.print("Enter the size of array:- ");
            int s = sc.nextInt();
            
            //initiallisation of new array
            int [] arr = new int[s];
            //prompt the user to enter the element of array
            System.out.println("Enter the element of array:- ");
            for(int i =0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(best(arr, 0));

        }
    }
}
