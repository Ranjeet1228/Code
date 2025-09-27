import java.util.Scanner;

public class quick2 {


    // Function to perform stable Count Sort
    public static void basicCountSort(int[] arr){

        //Find maximum element of array
        int max=findMax(arr);
        
        //create a count array to store the frequency of each element of array
        int [] count = new int[max+1];

        //count how many time elements present
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //transform count into prefix sum array
        for(int i=0;i<count.length;i++){
            if(i!=0)count[i]=count[i]+count[i-1];
        }

        // create the output array using the count array
        // We go from right to left to maintain stability
        int [] output = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            output[count[arr[i]]-1]=arr[i]; // Place the element in its correct sorted position
            count[arr[i]]--; // Decrease the count for that element
        }
        // Copy the sorted elements back into the original array
        for(int i=0;i<arr.length;i++){
            arr[i]=output[i];
        }
     
    }


     //function to find the maximum value in the array
    public static int findMax(int[] arr){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
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
            // function to sort the array
             basicCountSort(arr);

            // print the result;
            for(int val : arr){
                System.out.print(val+" ");
            }
        }
    }
}