import java.util.*;

public class FrequentArray {

    static int mostFrequent(int[] arr){
        Map<Integer,Integer> ar = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            if(ar.containsKey(arr[i])){
                int val = ar.get(arr[i]);
                ar.put(arr[i],++val);
            } else{
                ar.put(arr[i],1);
            }
        }

        int max = 0;
        int num =-1;
        for(var e: ar.entrySet()){
            if(max<e.getValue()){
                max = e.getValue();
                num = e.getKey();
            }
        }

        return num;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter the size of array:- ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the element of array:- ");
            for(int i =0; i<size; i++){
                arr[i]= sc.nextInt();
            }

            System.out.println(mostFrequent(arr));
        }
    }
}
