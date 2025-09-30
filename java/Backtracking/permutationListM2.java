import java.util.*;

public class permutationListM2 {


    public static void swap(int[] arr, int st, int end){
        int tem = arr[st];
        arr[st] = arr[end];
        arr[end] = tem;
    }

    public static List<List<Integer>> permutation(List<List<Integer>> ans, int[] nums, int idx){
            if(idx== nums.length -1){
                List<Integer> ll = new ArrayList<>();
                for(int i = 0; i<nums.length; i++){
                    ll.add(nums[i]);
                }
                ans.add(ll);
                return ans;
            }
            for(int i =idx; i<nums.length; i++){
                swap(nums,idx,i);
                permutation(ans, nums, idx+1);
                swap(nums, idx, i);
            }
            return ans;
        }


    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter size of element:- ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the number of element of array:- ");
            for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            List<List<Integer>> ans = new ArrayList<>();

            permutation(ans, arr, 0);

            for(List<Integer> ll : ans){
                for(int val : ll){
                    System.out.print(val+" ");
                }
                System.out.println();
            }
        }
    }
}
