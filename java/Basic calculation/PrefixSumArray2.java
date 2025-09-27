//find prefixSumArray method 2;
import java.util.*;
public class PrefixSumArray2 {
    //Find the prefix sum of array
    public static int prefixSum(int[][] arr, int r, int c){
    int sum=0;
    for(int i=0;i<=r;i++){
        for(int j=0;j<=c;j++){
            sum+=arr[i][j];
        }
    }
    return sum;
    }
    
    //Main function
    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)){
            //Enter row
            System.out.print("Enter row:- ");
            int row=sc.nextInt();

            //Enter number of column
            System.out.print("Enter number of col:- ");
            int col=sc.nextInt();

            //Initialization of array
            int[][] arr=new int[row][col];

            //Promt to enter element of array
            System.out.println("Enter elemnt of array:- ");
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    arr[i][j]=sc.nextInt();
                }
            }

            //Initiallization of new array having same row and column equal to arr
            int[][] brr=new int[arr.length][arr[0].length];

            //fill the array with prefix\
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    brr[i][j]=prefixSum(arr,i,j);
                }
            }

            //promt to enter the limit of indices 
            System.out.print("Enter l1 and r1:- ");
            int l1=sc.nextInt();
            int r1=sc.nextInt();
            System.out.print("Enter l2 and r2:- ");
            int l2=sc.nextInt();
            int r2=sc.nextInt();

            sc.close();//closing statement to prevent memory leak

            //find the sum of rectanguler subarray
           int  sum=brr[l2][r2]-brr[l1-1][r1]-brr[l2][r1-1]+brr[l1-1][r1-1];

           //Print the sum of subarray
            System.out.println(sum);
        }
    }
}
