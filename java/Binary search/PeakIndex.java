import java.util.Scanner;

public class PeakIndex {

    public static int peakIndexInMountainArray(int[] arr){
        int st=0, end = arr.length;
        int ans =-1;
        while(st<= end){
            int mid = st+(end- st)/2;
            if(arr[mid]<arr[mid+1]) {// we may be at uphill
                ans = mid+1;
                st= mid+1;
            } else{ // we are at downhill
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){

            System.out.print("Enter the size of array:- ");
            int size= sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the element of array:- ");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }

            int peakIdx= peakIndexInMountainArray(arr);

            System.out.println("index of peak:- "+ peakIdx);

        }
    }
}
