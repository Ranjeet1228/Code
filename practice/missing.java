import java.util.Scanner;

public class missing {

     static int missing (int [] arr){

        int max = arr[0];
        int ans = -1;
        for(int i =0; i<arr.length; i++){
            if(max<arr[i])max = arr[i];
        }
        int[] miss =new int[max+1];

        for(int i = 0; i<arr.length; i++){
            int n =arr[i];
            miss[n]++;
            
        }
        
        for(int i =1; i<miss.length; i++){
            if(miss[i]==0){
                ans = i;
            break;
            }
        }
        
        return ans;
     }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
             System.out.println("Enter size of array:-");
            int size = sc.nextInt();

            int[] arr = new int[size];
            

            System.out.println("Enter element:- ");
            for(int i = 0; i<size; i++){
                arr[i]= sc.nextInt();
            }

            int miss = missing(arr);
            System.out.println("the number which is missing:- "+ miss);
        }
    }
}
