import java.util.*;
public class RectangulerSumArray {
    //function t fill prefix in column
    public static void preSum(int[][]arr,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j==0){
                    continue;
                } else{
                    arr[i][j]+=arr[i][j-1];
                }
            }
        }
        return;
    }
    //find the sum of rectangle array
    public static int sumArray(int[][] arr, int l1, int r1,  int l2,int r2){
        int sum=0;
         for(int i=l1;i<=l2;i++){ //traverse through given range of row
            for(int j=r1;j<=r2;j++){ //traverse through given range of column
                if(r1==0){
                    sum+=arr[i][j];
                } else{
                    sum+=(arr[i][r2]-arr[i][r1-1]); //
                }
            }
         }
         return sum; //the value of sum will be return;
    }

    //Main function
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //prompt the user to enter the value of row and column
        System.out.print("Enter number of row and column:- ");
        int row= sc.nextInt();
        int col=sc.nextInt();

        //Initialization of array
        int[][] arr=new int[row][col];

        //prompt the user to enter the arr
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //find the prefix arry
        preSum(arr, row, col);

        //prompt to enter the value of query 
        System.out.print("Enter the number of query:- ");
        int query=sc.nextInt();
        sc.nextLine(); //Handle input skipping issue

        //Take query
        for(int i=1;i<=query;i++){
            System.out.print("Enter l1, r1:- ");
            int l1=sc.nextInt();
            int r1=sc.nextInt();

            System.out.print("Enter l2, r2:- ");
            int l2=sc.nextInt();
            int r2=sc.nextInt();
            //print the sum of rectangular subarray
            System.out.println(sumArray(arr,l1,r1,l2,r2));
        }
        sc.close();

    }

}
