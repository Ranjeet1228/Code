import java.util.Scanner;
public class tanspose{
    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)){
        //Enter row number 
        System.out.print("Enter no of row:- ");
        int row= sc.nextInt();
        
        //Enter column
        System.out.print("Enter no of column:- ");
        int column=sc.nextInt();
        
        //Initiallisation of 2D array
        int[][] arr= new int[row][column];
        
        //promt to insert the value of array using loop
        System.out.println("Enter the element of array");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
            arr[i][j]=sc.nextInt();    
            }
        }
        //swap the element of matrix 
      for(int i=0;i<row;i++){
          for(int j=i;j<column;j++){
             int swap=arr[i][j];
             arr[i][j]=arr[j][i];
             arr[j][i]=swap;
          }
      }
      //print the transpose of matrix
      System.out.println("\ntranspose of matrix will be:- ");
      for(int i=0;i<column;i++){
          for(int j=0;j<row;j++){
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();//for new line character

      }
        
       
        }
    }
}
