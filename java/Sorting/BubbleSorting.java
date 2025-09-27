import java.util.Scanner;
public class BubbleSorting {
    public static void sorting(int[] arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                /*last i element are already sorted so there is not need
                 to sort them*/
                if(arr[j]>arr[j+1]){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
    }
    
    //Main function
    public static void main(String[] args) {
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
            for(int sort: arr){
                System.out.print(sort+" ");
            }
        }
    }
    
}
