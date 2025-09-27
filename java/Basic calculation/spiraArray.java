
//To print having all element 1 in array and print it in spiral array
import java.util.*;
public class spiraArray{
    
    //fuction to fill array
    public static void fillArray(int[][] arr, int size){
        int leftcol=0;
        int rightcol=size-1;
        int toprow=0;
         int bottomrow=size-1;
         int num=1;
         
         //Insert the value
         while(rightcol>=leftcol&&toprow<=bottomrow){
            //Traverse from left to right
            for(int i=leftcol;i<=rightcol;i++){
                arr[toprow][i]=num++;
            }
            toprow++;

            
           //Traverse from top to bottom
            for(int i=toprow;i<=bottomrow;i++){
                arr[i][rightcol]=num++;
            }
            rightcol--;
            
           //Traverse from right to left
           if(toprow<=bottomrow){
            for(int i=rightcol;i>=leftcol;i--){
                arr[bottomrow][i]=num++;
            }
             bottomrow--;
           }
           
            
           //Traverse from bottom to top
            if(leftcol<=rightcol){
            for(int i=bottomrow;i>=toprow;i--){
                arr[i][leftcol]=num++;
            }

            leftcol++;
            }
        }
        return;
    }
    
    
    //function to print the array
    public static void printArray(int[][] arr, int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        return;
    }
    
    
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        //Enter size of array
        System.out.print("Enter size of an array:- ");
        int size=sc.nextInt();
        
        
        //Initialization of array
        int[][] arr= new int[size][size];
        //Insert the value of array
        fillArray(arr,size);
        //printArray
        printArray(arr,size);
        sc.close();
        
    }
}

