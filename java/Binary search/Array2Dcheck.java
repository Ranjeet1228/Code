/*Write an efficient algorithmthat search for value target an m X n integer matrix. This matrix follow properties

 * Integer in each row are sorted in ascending from left to
 * Integer in each column are sorted in asscending from top to bottomm
 
 * leetcode 240 Search a 2D matrix II
 */

import java.util.Scanner;
public class Array2Dcheck {

    // method to check the the target is present in 2D array
    public static boolean Check(int[][] arr,int tar){
        int i=0,j=arr[0].length-1; //start with topmost 

        while(i<arr.length&&j>=0){
            if(tar==arr[i][j]) return true; // return true
            else if(tar>arr[i][j]) i++; // move down if tar is greater
            else j--; // move left if tar is smaller 
        }
        return false; // if target is not found 
    }

    //Main function
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter row number:- ");
            int row = sc.nextInt();

            System.out.print("Enter col number:- ");
            int col = sc.nextInt();

            int[][] arr = new int[row][col];

            System.out.println("Enter element of 2D array which are sorted in column:- ");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    arr[i][j]=sc.nextInt();
                }
            }

            System.out.print("Enter target:- ");
            int tar= sc.nextInt();

            boolean flag = Check(arr,tar);

            if(flag) System.out.printf("%d is present in array arr",tar);
            else System.out.printf("%d is not present in array arrr",tar);
        }
    }
}