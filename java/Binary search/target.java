import java.util.Scanner;

public class target {

    public static int findTar(int[] arr, int tar) {
        int st = 0, end = arr.length - 1;
    
        // Binary search loop
        while (st <= end) {
            int mid = st + (end - st) / 2;
    
            // If target found at mid, return index
            if (arr[mid] == tar) return mid;
    
            // Check if the right half is sorted
            if (arr[mid] <= arr[end]) {
                // If target lies within the sorted right half
                if (arr[mid] < tar && tar <= arr[end]) {
                    st = mid + 1; // Search in right half
                } else {
                    end = mid - 1; // Search in left half
                }
            }
            // Else, left half must be sorted
            else {
                // If target lies within the sorted left half
                if (arr[st] <= tar && tar < arr[mid]) {
                    end = mid - 1; // Search in left half
                } else {
                    st = mid + 1; // Search in right half
                }
            }
        }
    
        // Target not found
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

        int index =findTar(arr,tar);

        System.out.printf("idx at which %d is present in arr:- %d",tar,index);
       } 
    }
}