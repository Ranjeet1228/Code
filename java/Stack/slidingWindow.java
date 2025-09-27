import java.util.Scanner;
import java.util.Stack;

public class slidingWindow {

    public static int[] max(int[] arr, int k){
        int size = arr.length;

        int[] maxIdx= maxIdx(arr);

        int[] maximum =new int[size-k+1];

        int idx =0;
        for(int i =0; i<size-k+1; i++){
           int j =i;
           int max =arr[i];
           while(j<i+k){
            max = arr[j];
            j = maxIdx[j];
           }
           maximum[idx++]=max;
        }
        return maximum;
    }


    public static int[] maxIdx(int[] arr){
        int[] max = new int[arr.length];

        Stack<Integer>st = new Stack<>();

        for(int i =0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]) max[st.pop()]=i;
            st.push(i);
        }
        while(!st.isEmpty()){
            max[st.pop()]=arr.length;
        }
        return max;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter size of array:- ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter element of araray:- ");
            for(int i =0; i<arr.length; i++){
                arr[i]=sc.nextInt();
            }

            int[] maxm = max(arr, 3);
            for(int val: maxm){
                System.out.print(val+" ");
            }

        }
    }
}
