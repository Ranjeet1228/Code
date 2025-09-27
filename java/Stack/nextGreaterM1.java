import java.util.Scanner;
public class nextGreaterM1 {

    static int[] greater(int[] arr){

        int[] ans = new int[arr.length];

        for(int i=0 ; i<arr.length;i++){
            int big = -1;
            for(int j=i;j<arr.length; j++){

                if(arr[i]<arr[j]){
                    big= arr[j];
                    break;
                }
            }
             ans[i]= big;
        }

        return ans;
    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){


            System.out.print("Enter length of array:- ");
            int s= sc.nextInt();

            int [] arr = new int[s];
            
            System.out.println("Enter element of array:- ");
            for(int i=0; i<s; i++){
                arr[i]= sc.nextInt();
            }

            int[] ans = greater(arr);

            System.out.println("Greater element:- ");
            for(int val : ans){
                System.out.print(val+" ");
            }


        }
    }
}
