// Given an array where all its element sorted in increasing order except two swapped elements. 
// Sort it in linear time.Assume there a no duplicate in the array

import java.util.Scanner;
public class sortingQ1M1 {
    //methode to sort the  given partially sorted array in linear time
    static void sort(int[] arr){
        //make two pointer approach at two both end
        int i=0;
       int  j=arr.length-1;
        while(i<j){
            while(i<arr.length-1&&arr[i]<arr[i+1]) i++;
            while(j> 0&&arr[j]>arr[j-1]) j--;
            if(i<j) swap(arr,i,j);
        }
    }
    static void swap(int[] arr,int i,int j){
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j]=tem;
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