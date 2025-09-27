import java.util.*;

public class MaxOnTable {


    public static int maxNum(int[] arr){

        HashSet<Integer> table = new HashSet<>();

        int len =0;
        for(int i =0;i<arr.length; i++){

            if(table.contains(arr[i]))
            table.remove(arr[i]);

            else{
                table.add(arr[i]);
                len= Math.max(table.size(),len);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter the length of array:- ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the element of array(It should be paired form):- ");
            for(int i = 0; i< arr.length; i++){
                arr[i]= sc.nextInt();
            }

            int maxLength = maxNum(arr);
            System.out.println("The max number of numbers that were on the table at the same time :- "+maxLength);
        }
    }
}
