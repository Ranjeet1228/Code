import java.util.Scanner;
import java.util.Stack;

public class removeConsecutiveSubsequese {

    public static int[] delete(int[] arr){
        Stack <Integer> st = new Stack<>();

        for(int i=0;i<arr.length; i++){
            if(st.isEmpty()) st.push(arr[i]);
            else{
                if(arr[i-1] == arr[i]){
                    if(st.peek()== arr[i]) st.pop();
                }

                else st.push(arr[i]);
            }
        }

        int[] ans = new int[st.size()];
        
        for(int i = ans.length-1 ;i>=0; i--){
            ans[i]= st.pop();
        }
        return ans;
    }

    public static void main(String[] args){
        try(Scanner sc = new Scanner (System.in)){

            System.out.print("Enter size of array:- ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            
            System.out.println("Enter element of element:- ");
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }

            int [] ans = delete(arr) ;

            for(int val: ans){
                System.out.print(val+" ");
            }
        }
    }
}





/*
 * Enter size of array:- 5
Enter element of element:- 
1 2 2 2 3
 ans:- 1 3 
 */