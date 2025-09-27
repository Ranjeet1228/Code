import java.util.*;

public class firstNegativeNum{

    public static ArrayList<Integer> firstNegInt(int[] arr, int k){
        ArrayList<Integer> al= new ArrayList<>();
        Queue<Integer>  q = negative(arr);

        for(int i =0; i<arr.length-k+1; i++){

            if(q.peek()<i){
                q.poll();
            }
            if(q.isEmpty()) al.add(0);
            else {
                int val = (q.peek()>i+k-1)? 0 : arr[q.peek()];
                al.add(val);
            }
        }

    
        return al;
    }

    public static Queue<Integer> negative(int[]arr){
        Queue<Integer>  q = new LinkedList<>();
        for(int i =0; i<arr.length; i++){
            if(arr[i]<0) q.add(i);
        }
        return q;
    }
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of array:- ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the element of array:- ");
            for(int i =0; i<arr.length; i++){
                arr[i]=sc.nextInt();
            }


            System.out.print("Enter the range:- ");
            int k = sc.nextInt();
            ArrayList<Integer>  al = firstNegInt(arr,k);
            for(int val: al){
                System.out.print(val+" ");
            }
        }
    }
}