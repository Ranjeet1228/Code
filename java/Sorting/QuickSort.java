import java.util.Scanner;
public class QuickSort {
    //function to place pivot at correct position
    public static int partition(int[] arr,int st,int end){
        int count=0;
        int piv= arr[st];//choose the first element as the pivot

        //count how many elements are less than or equal to pivot
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=piv) count++;
        }

        int pi = st+count; //calculate pivot index
        Swap(arr, pi, st);// Move pivot to its correct position

        int i=st;
        int j=end;

        //Arrange elements on the left and right side of pivot
        while(i<pi&&j>pi){
            // Move i forward untill an element is >=pivot
            while(arr[i]<piv) i++;
            // Move j backward until an element is<= pivot
            while(arr[j]>piv) j--;

            //Swap if valid i and j found on wrong side
            if(i<pi&&j>pi) {
                Swap(arr,i,j);
                i++;
                j--;
 
      }
    }
    return pi; //return final position of pivot
 }

    //function to swap to element of array
    public static void Swap(int[] arr,int r,int c){
        int swap=arr[r];
        arr[r]=arr[c];
        arr[c]=swap;
    }

    
    //Main recursive function to sort an array
    public static void quickSort(int[] arr,int st,int end){
        if(st>=end) return; // base case 
        int pi = partition(arr,st,end); // partition and get pivot index

        //Recursively sort element before and after partion
        quickSort(arr,st, pi-1);
        quickSort(arr,pi+1,end);
    }
    
    //Main function
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            //prompt the user to enter the size of array
            System.out.print("Enter size of array:- ");
            int s = sc.nextInt();
            int[] arr = new int[s];

            //prompt the user to enter the element of array
            System.out.println("Enter the element of array:- ");
            for(int i =0;i<arr.length;i++){
                arr[i]= sc.nextInt();
            }
            // call quicksort on entire array
            quickSort(arr,0,arr.length-1);

            //print the sorted array
            System.out.println("After sorting:- ");
            for(int val: arr){
                System.out.print(val+" ");
            }
        }

    }
}