package java.Sorting;
import java.util.Scanner;
public class sortingQ3 {

    public static void sort(int[] arr){
        int max = findMax(arr);
        int[] count = new int[max+1];
        //store frequency of array
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        // make count array as prefix sum array
        for(int i=0;i<count.length;i++){
            if(i!=0) count[i]+=count[i-1];
        }
        
        int[] output = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int idx= count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=output[i];
        }
    }

    public static int findMax(int[] arr){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max =arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            //prompt the user to enter size of array
            System.out.print("Enter size of array:- ");
            int s = sc.nextInt();
            int[] arr = new int[s];
            // prompt the user to enter the element 
            System.out.println("Enter the element of array:- ");
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            sort(arr);
            for(int val: arr){
                System.out.print(val+" ");
            }
        }
    }
}
