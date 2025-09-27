import java.util.*;

public class longestSubarray {

    public static int lengthSubarray(int[] arr){
        HashMap<Integer,Integer> mp = new HashMap<>();

        int presum =0;
        int len =0;
        for(int i = 0; i<arr.length;i++){

            presum+=arr[i];

            if (presum == 0)  len = i + 1;
            if(mp.containsKey(presum)) len = Math.max(len, i-mp.get(presum));
            else mp.put(presum, i);
        }
        return len;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter the size of array:- ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the element of array:- ");
            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }

            int MaxLength = lengthSubarray(arr);
            System.out.println("Length of longeset sub array having sum equal to zero is :- "+ MaxLength);

        }
    }
}
