import java.util.Scanner;

public class insertionSort {

    //function to sort array
    public static void sorting(int[] arr){
        for(int i =1;i<arr.length;i++){
            int j = i;
            while(j>0&&arr[j]<arr[j-1]){ //if arr[j]<arr[j-1] swap until it get perfect position
                int tem = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=tem;
                j--; //decrease the value of j to compare other previous value
            }
        }
    }
    //Main function
     public static void main(String [] args) {
        try(Scanner sc = new Scanner(System.in)){
            //prompt the user to enter the size of array
            System.out.print("Enter size of array:- ");
            int s = sc.nextInt();
            int[] arr = new int[s]; 

            //prompt the user to enter the element of array
            System.out.println("Enter the element of array:- ");
            for(int i =0;i<arr.length;i++){
                arr[i]= sc.nextInt();
            }
            // sort array
            sorting(arr);
            //print the result 
            System.out.print("Sorted array:- ");
            for(int sort: arr){
                System.out.print(sort+" ");
            }
        }
    }
}
