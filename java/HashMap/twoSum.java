import java.util.*;

public class twoSum {

    public static int[] sum(int[] arr,int target){

        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i = 0;i<arr.length;i++){
            int patner = arr[i];

            if(!mp.containsKey(target-patner)) mp.put(patner,i);
            
            else if(mp.containsKey(target-patner))
               return new int[] {mp.get(target-patner),i};
                
        }
        return new int[]{-1};
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter the size of array:- ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the element of array:- ");
            for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }


            System.out.print("Enter target:- ");
            int target = sc.nextInt();

            int[] al = sum(arr, target);

            for(int val: al){
                System.out.print(val+" ");
            }
        }
    }
}
