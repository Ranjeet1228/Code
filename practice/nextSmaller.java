import java.util.Scanner;
import java.util.Stack;

public class nextSmaller {
    public static int[] small(int[] arr){
        Stack<Integer> st = new Stack<>();
        int [] res = new int[arr.length];

        for(int i = 0; i<arr.length; i++){
            res[i]= -1;
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                res[st.peek()] =  arr[i];
                st.pop();
            }
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)){

            System.out.print("Enter size of array:- ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the element of array:- ");
            for(int i =0 ; i<size; i++){
                arr[i] = sc.nextInt();
            }

            int[] res = small(arr);

            for(int val : res){
                System.out.print(val+" ");
            }
        }
    }
}
