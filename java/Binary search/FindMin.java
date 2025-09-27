import java.util.Scanner;
public class FindMin {
    public static int findMIN(int[] arr){
        int n = arr.length;
        int st =0,end =n-1, ans = -1;
        while (st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]<=arr[n-1]){ //if mid is less than last index it mean we are in second sorted array where min is present
                ans = mid;
                end=mid-1;
            } else if(arr[mid]>arr[n-1]){// if mid is greater than last index it mean mid is at first sorted array then search at right side
                st=mid+1;
            }
        }
        return ans;
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
        int min =findMIN(arr);

        System.out.printf("idx at which Min is present in arr:- %d",min);
       } 
    }
}