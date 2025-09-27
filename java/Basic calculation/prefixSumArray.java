import java.util.Scanner;

public class prefixSumArray {
   //Function to fill prefix in the array
    public static void presum(int[][] arr, int row, int col){
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j==0){
                } else
                arr[i][j]+=arr[i][j-1];
            }
        }
    }
    //find sum array
    public static int sumArray(int[][] arr,int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){

            if(r1==0){
                sum+=arr[i][r2];
            } else
            sum+=(arr[i][r2]-arr[i][r1-1]);
        }
        return sum;
    }
    
    public static void main(String[] args){
       try(Scanner sc = new Scanner(System.in)){
        //Enter number of row
        System.out.print("Enter number of row:- ");
        int row= sc.nextInt();
        
        //Enter number of column
        System.out.print("Eneter number of column:- ");
        int col=sc.nextInt();
        
        //Initialization of array

        int[][] arr= new int [row][col];
        
        //Enter element of arr
        System.out.println("Enter the element of the array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        //Make prefix array of arr
       presum(arr,row,col);
       
       //enter number of query 
       System.out.print("Enter number of query:- ");
       int query =sc.nextInt();
       
       for(int i=1;i<=query;i++){
           System.out.print("\nEnter l1,r1:- ");

           int l1=sc.nextInt();
           int r1=sc.nextInt();
           System.out.print("Enter l2,r2:- ");
           int l2=sc.nextInt();
           int r2=sc.nextInt();

           if(l2>row||r1>col||l1>row||r2>col){
            System.out.println("Invalid");
            return;
           }
           System.out.println("Sum of sqauare from("+l1+","+r1+") to ("+l2+","+r2+"):- "+sumArray(arr,l1,r1,l2,r2));
       } 
    }
}
 
}
