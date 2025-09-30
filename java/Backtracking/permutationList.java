import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class permutationList {
 
    public static void helper(int[] nums,List<Integer> ds,boolean[] isValid,List<List<Integer>>ans){
        if(ds.size()==nums.length){
           List<Integer> list = new ArrayList<>();
           for(int i = 0; i< ds.size(); i++){
            list.add(ds.get(i));
           }
           ans.add(list);
           return;
        }

        for(int i = 0; i<nums.length; i++){
            if(isValid[i]==false){
                ds.add(nums[i]);
                isValid[i]=true;
                helper(nums,ds,isValid,ans);
                isValid[i] = false;
                ds.remove(ds.size()-1);
            }
        }
    }

    public static List<List<Integer>> permutation(int[] arr){

        List<List<Integer>>ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        boolean[] isValid = new boolean[arr.length];
        helper(arr,ds,isValid, ans);
        return ans;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
           

            System.out.print("Enter the length of array: - ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            
            System.out.println("Enter the element of array:- ");
            for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            List<List<Integer>> ll= permutation(arr);

            for(List<Integer> l1 : ll){
                for(int val : l1){
                    System.out.printf("%d ", val);
                }
                System.out.println();
            }

        }
    }
}