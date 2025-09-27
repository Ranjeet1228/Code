import java.util.Scanner;

public class AlgorithmByBoolean {
    public static boolean search(int [] arr,int tar){
        int st = 0, end = arr.length-1;
        while(st<= end){
            int mid = (st+end)/2;
            if(arr[mid]==tar) return true;
            else if(arr[mid]>tar) end = mid -1;
            else if(arr[mid] <tar) st = mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        System.out.print("enter size of array:- ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter elemenet of array in sorted form:- ");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter target:- ");
        int target = sc.nextInt();
        boolean binSearch = search(arr,target);
        System.out.printf("%d in arr: %b", target,binSearch+" ");
    }
    
   } 
}