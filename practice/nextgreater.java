import java.util.Scanner;
import java.util.Stack;
public class nextgreater {
static int[] sto (int[] arr){
    int[] res = new int[arr.length];
    Stack <Integer> st = new Stack<>();
    for(int i=0; i<arr.length; i++){
        res[i]= -1;
        while(!st.isEmpty() && arr[st.peek()]<arr[i]){
            res[st.peek()]= arr[i];
            st.pop();
        }
        st.push(i);
    }
    return res;
}

    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size:- ");
            int size = sc.nextInt();

            int [] arr = new int[size];

            System.out.println("Enter the element of array:- ");
            for(int i= 0; i<size; i++){
                arr[i]= sc.nextInt();
            }

            int [] res = sto(arr);
            for(int val: res){
                System.out.print(val+" ");
            }
        }
    } 
    
}
