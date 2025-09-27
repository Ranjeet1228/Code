
import java.util.Scanner;

public class PeakElement {
    public static int peakElt(int [] arr){
        int st =0,end =arr.length-1;
        int n =arr.length-1;
        while(st<=end){
            int mid =st+(end-st)/2;
            if((mid==0|| arr[mid]>arr[mid-1])&&(mid==n|| arr[mid]>arr[mid+1])) return mid;
            if(arr[mid]<arr[mid+1]){ //we are at uphills
                st = mid+1;
            } else end = mid-1; //we are at downhills
        }
        return -1;
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
