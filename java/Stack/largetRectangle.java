import java.util.Scanner;
import java.util.Stack;

public class largetRectangle {


    // find largest area of rectangle
    public static int largestRectangle(int[] arr){

        int[] nsm = nextsmall(arr);
        int[] psm = psmall(arr);
    

        int max =0;

        for(int i =0; i<arr.length; i++){

           int area= arr[i]*(nsm[i]- psm[i]-1);

            if(max<area) max = area;
            
        }

        return max;
    }

    // find next minimum
    public static int[] nextsmall(int[] arr){

        int[] rem = new int[arr.length];
        Stack <Integer> st = new Stack<>();

        for(int i = arr.length-1; i>= 0; i--){
            
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                st.pop();
            }

            rem[i]= (st.isEmpty())? arr.length : st.peek();
            st.push(i);
        }
        return rem;
    }



    // find preveous small
    public static int[] psmall(int[] arr){

        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];

        for(int i = 0; i<arr.length; i++){

            while(!st.isEmpty() && arr[i] <arr[st.peek()]){
                st.pop();
            }

            res[i]= (st.isEmpty())? -1: st.peek();

            st.push(i);
        }
        return res;
    }


    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter size of array:- ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the element of array:- ");
            for(int i = 0; i<size; i++){
                arr[i] = sc.nextInt();
            }

           
            int maxarea = largestRectangle(arr);
            System.out.println("Largest area of hist. :- "+ maxarea);

        }
    }
}
