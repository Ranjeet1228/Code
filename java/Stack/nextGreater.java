import java.util.Scanner;
import java.util.Stack;

public class nextGreater{

    static int[] greater(int[] arr){
        int[] res = new int[arr.length];
        Stack <Integer> st = new Stack<>();

        res[arr.length -1]= -1;
        st.push(arr[arr.length-1]);
        
        for(int i = arr.length-2; i>=0; i--){

            while(!st.isEmpty() && st.peek()<arr[i]){
                st.pop();
            }

            if(st.isEmpty()) res[i]= -1;
            else res[i]= st.peek();

            st.push(arr[i]);
        }

        return res;
    }

    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter length of array:- ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            
            System.out.println("Enter element of array:- ");
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }


            int[] res = greater(arr);

            for(int val : res){
                System.out.print(val+" ");
            }
        }
    } 
}