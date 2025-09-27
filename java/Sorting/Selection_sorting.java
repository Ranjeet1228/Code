import java.util.Scanner;
public class Selection_sorting {

    //funtion to sort array
    public static void sorting(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIdx = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            if(minIdx!=i)
            swap(arr,i,minIdx); //function call to swap array
        }
    }
    //function to swap 
    public static void swap(int[] arr,int i,int j){
        int tem=arr[i];
        arr[i]=arr[j];
        arr[j]=tem;
    }
    //Main function 
    public static void main(String[] arg){
        try(Scanner sc = new Scanner(System.in)){

            //prompt the ueser to enter size of array;
            System.out.print("Enter size of array:- ");
            int n = sc.nextInt();
            
            int[] arr  = new int [n]; //declaration of array

            //prompt the user to enter enter element of array
            System.out.println("Enter element of array:- ");
            for(int i = 0;i<arr.length;i++){
                arr[i]= sc.nextInt();
            }
            sorting(arr);//function to sort array

            //print the array:- 
            System.out.print("After sorting:- ");
            for(int i:arr){
                System.out.print(i+" ");
            }

        }
    }
}