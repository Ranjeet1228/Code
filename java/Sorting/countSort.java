import java.util.Scanner;

public class countSort {

    //function to sort array
    static void basicCountSort(int[] arr){
        //find maximum element in the array
        int max = findMax(arr);

        //create a  count array of size 
        int[] count = new int[max+1];

        //count every element and store the frequency of element
        for(int i=0;i<arr.length;i++){
        count[arr[i]]++;
        }

        //re asign the value of on the basis of count aray 
        int k= 0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
            arr[k++]= i; // put the value of i in array to the number of time it came in aray
            }
        }
    }

        //function to find maximum element in array
        static int findMax(int[] arr){
            int max = Integer.MIN_VALUE;
                for(int i =0;i<arr.length;i++){
                if(arr[i]>max) max = arr[i];
                }
                return max;
            }


    //main function
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
            // function to sort the array
            basicCountSort(arr);

            // print the result;
            for(int val : arr){
                System.out.print(val+" ");
            }
        }
    }
}