import java.util.Scanner;

public class RotatedSorted {
    public static int findTar(int[] arr,int tar){
        int n= arr.length;
        int st =0, end = n-1; 
        int ans =-1;
        while(st<=end){ 
            int mid= st+(end-st)/2;
           if(arr[mid]==tar){
            ans = mid;
            st = mid+1;
           }

           // if right is sorted
           else if(arr[mid]<=arr[end]){
            if(arr[mid]<tar&&arr[end]>=tar){
                st = mid+1;
            } else end = mid -1;
           } else{// left is sorted
            if(arr[st]<tar&& arr[mid]>= tar) end = mid-1;
            else st= mid+1;
           }
        }
        return -1;
    }

    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the length of array:- ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter element of rotated sorted array:- ");
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("Enter target value:- ");
        int tar = sc.nextInt();

        int min =findTar(arr,tar);

        System.out.printf("idx at which %d is present in arr:- %d",tar,min);
       } 
    }
}
