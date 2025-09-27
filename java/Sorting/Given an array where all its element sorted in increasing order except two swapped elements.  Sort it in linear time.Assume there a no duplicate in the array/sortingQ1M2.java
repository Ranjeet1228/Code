import java.util.Scanner;

public class sortingQ1M2 {
    static void sort(int[] arr){
        int x=-1,y=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){
                    x=i-1;
                    y=i;
                } else{
                    y=i;
                }
            }
            if(x!=-1 && y!=-1)
            Swap(arr,x,y);
        }
    }


    static void Swap(int[] arr,int i,int j){
        int tem = arr[i];
        arr[i]= arr[j];
        arr[j]= tem;
    }


     public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            //prompt the user to enter size of array
            System.out.print("Enter size of array:- ");
            int s = sc.nextInt();
            int[] arr = new int[s];
            // prompt the user to enter the element 
            System.out.println("Enter the element of array:- ");
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            sort(arr);
            for(int val: arr){
                System.out.print(val+" ");
            }
        }
    }
}