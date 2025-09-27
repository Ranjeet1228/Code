import java.util.Scanner;
import java.util.Stack;

public class stock {

    static int[] St(int [] arr){
        int[] res = new int[arr.length];
        Stack <Integer> st = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(st.size()>0 && arr[st.peek()]<=arr[i]) st.pop();
            res[i] = (st.isEmpty())? i+1: i-st.peek();
            st.push(i);
        }
        return res;
    }
   public static void main(String[] args){
    try(Scanner sc = new Scanner (System.in)){
        System.out.print("Enter the length of array:- ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the element of array:- ");
        for(int i = 0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = St(arr);
        for(int val : res){
            System.out.print(val+" ");
        }

    }
   } 
}
