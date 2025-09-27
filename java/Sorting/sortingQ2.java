import java.util.Scanner;

public class sortingQ2 {

    //function to rearrange the element in one side positive and negative both are on their corresponding side
    public static void sort(int[] arr){
        
        int i=0, j= arr.length-1;
        //use two pointer approach to move positive and negative number at their correct position
        while(i<j){
            // move pointer i until it get positive number
            while(i<arr.length&&arr[i]<0) i++;
            //move the pointer j until it get negative number
            while(j>=0&&arr[j]>0)j--;
            //if i!>j then swap and update the value of i and j
            if(i<j){ swap(arr,i,j);
            i++; 
            j--;
            }
            
        }
    }
    //function to swap array
    public static void swap(int[] arr,int i, int j){
        int tem = arr[i];
        arr[i]= arr[j];
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
            sort(arr);
            for(int val:arr){
                System.out.print(val+" ");
            }
        }
    }
}