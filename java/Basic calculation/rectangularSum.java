//To find the rectangular sum of a sub array
import java.util.Scanner;
public class rectangularSum{
    
    //function to find the sum of particular indexes
    public static int sumOfIndex(int[][]arr, int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
            sum+=arr[i][j];
        }
      }
      return sum;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        //Enter no of row
        System.out.print("Enter number of rows:- ");
        int row=sc.nextInt();
        //Enter no of column
        System.out.print("Enter number of columns:- ");
        int column=sc.nextInt();
        //Initialization of array
        int[][] arr= new int[row][column];
        
        //promt to insert the value of array loop
        System.out.println("Enter the element of the array:- ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the starting indices :- ");
        int l1=sc.nextInt();
        int r1=sc.nextInt();

        System.out.print("Enter the ending indices of array:");
        int l2=sc.nextInt();
        int r2=sc.nextInt();
         sc.close();
        if(l1<=l2&&r1<=r2&&l1>=0&&l2<row&& r1>=0&&r2<column){
        System.out.println("Sum of indices from("+l1+","+r1+")to("+l2+","+r2+"):-");
        System.out.print(sumOfIndex(arr,l1,r1,l2,r2));
        } else{
            System.out.println("invailid input");
            return;
        }
       
    }
}
