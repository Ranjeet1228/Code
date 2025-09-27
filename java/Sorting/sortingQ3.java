import java.util.Scanner;

public class sortingQ3 {

    // Function to sort array containing only 0s, 1s, and 2s
    public static void sort012(int[] arr){
        int low = 0, mid= 0, high = arr.length-1;

         // Process elements until mid pointer exceeds high
        while(mid<=high){
            //if current element is  0 swap it with low
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++; //move low pointer ahead
                mid++;// move mid pointer ahead

            } // if current element is  1 move one step 
            else if(arr[mid]==1) mid++; 
            // if current element is 2 swap it with high
            else if(arr[mid]==2){
                swap(arr,high,mid);
                high--; //move high pointer one step back
            }
        }
    }

    public static void swap(int[] arr, int n,int j){
        int tem= arr[n];
        arr[n]= arr[j];
        arr[j]= tem;
    }
     public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter size of array:- ");
            int s = sc.nextInt();
            int[] arr = new int[s];
            System.out.println("Enter element of array:- ");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            sort012(arr);
            for(int val:arr){
                System.out.print(val+" ");
            }
        }
    }
}