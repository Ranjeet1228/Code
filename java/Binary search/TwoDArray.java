
import java.util.Scanner;

public class TwoDArray {
    //method to check the target is present in 2D array or not
    public static boolean Check(int[][] arr,int tar){

        // get no of row and column
        int n = arr.length,m = arr[0].length;

        // convert the 2D array in 1D array
        int st =0,end = n*m-1;
        while(st<=end){
            int mid = st+(end-st)/2; //find the mid

            int midElt = arr[mid/m][mid%m];// again convert the 1D array into 2D array

            if(midElt==tar) return true; //found
            else if(midElt>tar) end = mid-1;// search at left
            else st= mid+1; //search at right
        }
        return false;// not found
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the row no:- ");
            int row = sc.nextInt();

            System.out.print("Enter the column no:- ");
            int col = sc.nextInt();

            int[][] arr = new int[row][col];

            System.out.println("Enter the element of 2D array in sorted form:- ");
             for(int i=0;i<arr.length;i++){
                for(int j =0;j<arr[0].length;j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.print("Enter target:- ");
            int tar = sc.nextInt();

            boolean check= Check(arr, tar);

            if(check) System.out.printf("%d is present",tar);
            else System.out.printf("%d is not present",tar);
        }
    }
}
