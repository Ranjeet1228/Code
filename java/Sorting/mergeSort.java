import java.util.Scanner;
public class mergeSort {
      
    //function to merge two sorted halves of array
    static void sort(int[] arr,int l,int mid,int n){
        int n1 = mid-l+1;
        int n2 = n-mid;

        //creat temporary arrays
        int[] left = new int[n1];
        int[] right=new int[n2];

        //copy data to temporary array
        for(int i=0;i<n1;i++)left[i]=arr[l+i];
        for(int j=0;j<n2;j++) right[j]=arr[mid+1+j];
        int i=0;
        int j=0;
        int k=l;

        //merge the temporary variable in array
        while(i<n1&&j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            } else{
                arr[k++] = right[j++];
            }
        }
        while(i<n1) arr[k++]=left[i++]; //copy remaining element of array left[], if any
        while(j<n2) arr[k++]=right[j++]; //copy remaining element of array right[] , if any;
    }

    //recursive function to divide the arr into two halve and short them
    static void mergesort(int[] arr,int l,int n){
        if(l>=n) return; //base case: one or no element
        int mid = (l+n)/2;

        //recurcive function to divide the array into two halve 
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,n);
        sort(arr,l,mid,n); //function to short the array 
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
            mergesort(arr,0,arr.length-1); //function call to sort the array

            //print the result
            System.out.println("After sorting:- ");
            for(int val: arr){
                System.out.print(val+" ");
            }
        }
    }  
}
