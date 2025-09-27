import java.util.Scanner;
import java.util.Stack;

public class StackSpan {

    static int[] stocks (int[] arr){
            
            int[] res = new int[arr.length];

            Stack<Integer> st = new Stack<>();

            for(int i=0; i<arr.length; i++){
                
                while(!st.isEmpty() && arr[i]>= arr[st.peek()]) st.pop();
                if(st.isEmpty()) res[i]= i+1;
                else res[i] = i - st.peek();
                 
                 st.push(i);
                }
               
            
            return res;
        }
    public static void main(String[] args) {

        
        
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter length of array:- ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter element of array:- ");
            for(int i=0; i<arr.length; i++){
                arr[i]= sc.nextInt();
            }

            int[] res = stocks(arr);

            for(int val: res){
                System.out.print(val+" ");
            }


        }
    }
}
