import java.util.Scanner;
import java.util.HashSet;
public class longestElementSequence {


    public static int longest(int[] arr){

        HashSet<Integer> mp = new HashSet<>();
        for(int i =0;i<arr.length; i++){
            mp.add(arr[i]);
        }

        int len = 0;
        
        for(int el: mp){
            if(!mp.contains(el-1)){
                int currnum = el;
                int length =1;
                while(mp.contains(currnum+1)){
                    length++;
                    currnum++;
                }
                len = Math.max(len,length);
            }
        }

        return len;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter the size of hashSet:- ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the element of array:- ");
            for(int i =0; i<size; i++){
               arr[i]= sc.nextInt();
            }

            System.out.println("longest length of consecutive element sequence:- "+ longest(arr));
        }
    }
}