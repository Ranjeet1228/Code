import java.util.Scanner;

public class MoveZeroes {
    //function to move all the 0 to last of index;
    public static void moveZero(int[] arr){
        for(int i =0;i<arr.length;i++){
            boolean flag= false; // to check the movement of zero
            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j]==0){ //if arr[j]=0 then swap the number
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true; // turn flag true if swap happen 
                } 
            }
            if(!flag) break; //if zero is not moves then it means that all zero has been moved to last then break;
        }
    }
    public static void swap(int[] arr,int i,int j){
        
    }
    public static void main(String[] args) {
         try(Scanner sc = new Scanner(System.in)){
            //prompt the user to enter the size of array
            System.out.print("Enter size of array:- ");
            int s = sc.nextInt();

            int[] arr = new int[s]; //declaration of array

            //prompt the user to enter the element of array
            System.out.println("Enter the element of array:- ");
            for(int i =0;i<arr.length;i++){
                arr[i]= sc.nextInt();
            }

            moveZero(arr); //function call to move the 0 to the last of array

            //print the array using for each loop
            System.out.print("After movement of zeroes :- ");
            for(int array: arr){
                System.out.print(array+" ");
            }
        }
    }
}