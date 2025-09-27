import java.util.Scanner;

public class Algorithm {

    // Recursive binary search function that returns true if target is found, false otherwise
public static boolean search(int[] arr, int st, int end, int target) {
    boolean check = false;  // Default value, will be updated based on the search result

    // Base case: if the start index exceeds the end, the element is not present
    if (st > end) {
        check = false;
        return check;
    }

    int mid = (st + end) / 2;  // Find the middle index

    // If target is greater, search in the right half
    if (arr[mid] < target)
        check = search(arr, mid + 1, end, target);

    // If target is smaller, search in the left half
    else if (arr[mid] > target)
        check = search(arr, st, mid - 1, target);

    // If target is found at mid
    else if (arr[mid] == target) {
        check = true;
    }

    return check;  // Return whether the target was found
}

   public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        System.out.print("enter size of array:- ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter elemenet of array in sorted form:- ");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter target:- ");
        int target = sc.nextInt();

        boolean CheckSearch = search(arr,0,arr.length-1,target);
        System.out.printf("%d in arr: %b", target,CheckSearch);
    }
    
   } 
}
