import java.util.Scanner;

public class SearchPeakIdxt {
    public static int findPeak(int [] arr){
        int st= 0,end = arr.length-1;
        while(st<end){
            int mid = st+(end- st)/2;
            if(arr[mid]>arr[mid+1]) end = mid;//we are at downhill
            else st=mid+1; // we are at uphill
        }
        return st;// or end, both are same at that point
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter size of array:- ");
            int size= sc.nextInt();

            int[] arr= new int[size];

            System.out.println("Enter elment of array in mountain form:- ");
            for(int i=0;i<size;i++){
                arr[i] =sc.nextInt();
            }
            int peak = findPeak(arr);
            System.out.println(peak);
        }
    }
}