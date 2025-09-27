import java.util.Scanner;

public class LastOccurence {
    public static int indexes(int[] arr,int tar){
        int ans = -1;
        int st = 0, end = arr.length-1;
        while(st<=end){
            int mid = st+(end - st)/2;
            if(arr[mid]>tar){
                end = mid-1;
            }else if (arr[mid]<tar){
                st = mid+1;
            } else{
                ans =mid;
                st = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter length of array:- ");
            int size = sc.nextInt();
            int [] arr = new int [size];
            System.out.println("Enter element of sorted array:- ");
            for(int i=0;i<arr.length;i++){
                arr[i]= sc.nextInt();
            }
            System.out.print("Enter target value:- ");
            int tar = sc.nextInt();
            int idx = indexes(arr, tar);
            if(idx!=-1){
                System.out.printf("index of %d is :- %d",tar,idx);
            }else{
                System.out.println("not found");
            }
        }
    }
}