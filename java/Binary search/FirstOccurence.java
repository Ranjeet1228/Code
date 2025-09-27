import java.util.Scanner;
public class FirstOccurence {

    //methode to find first occurence
    static int firstOccurence(int[] arr, int tar){
        int st = 0, end = arr.length-1;
        int idx=-1;
        while(st<=end){
            int mid = st+ (end- st)/2; // calculate the mid
            if(arr[mid]>tar){
                end = mid-1; // if mid value is greter than tar then search in left 
            }

            else if (arr[mid]<tar){
                st = mid+1; // if tar is greater then search in right direction
            }

             else if(arr[mid]== tar){
                idx=mid; // record the match 
                end = mid-1; // looking toward left to check number is present or not 
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter length of array:- ");
            int size = sc.nextInt();
            int [] arr = new int[size];
            System.out.println("Enter element of sorted array:- ");
            for(int i = 0;i<arr.length;i++){
                arr[i]= sc.nextInt();
            }
            System.out.print("Enter target value:- ");
            int tar = sc.nextInt();
            int idx = firstOccurence(arr, tar);
            if(idx>-1){
                System.out.printf("%d is found at:- %d",tar, idx);
            } else{
                System.out.println("not found");
            }
        }
    }
}
