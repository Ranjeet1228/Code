import java.util.Scanner;

public class MountainPeakElement {
    public static int peakElt(int[] arr){
        int st=0,end = arr.length-1;
        int ans =-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]) return arr[mid];
            if(arr[mid]<arr[mid+1]){
                ans = mid+1;
                st =mid=1;
            } else{
                end=mid;
            }
        }
        return arr[ans];
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size of array:- ");
            int size= sc.nextInt();

            int [] arr = new int[size];
            System.out.println("Enter the elemnt of array:- ");
            for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
            }
            int peak = peakElt(arr);
            System.out.println(peak);

        }
    }
}
