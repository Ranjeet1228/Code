import java.util.Arrays;
import java.util.Scanner;


public class Arraylist {
    public static class ArrayList{

        int[] arr = new int[2];
        int idx=0, size=0;

        public void add(int elem){ // to add element
            if(size== arr.length){
                arr= Arrays.copyOf(arr,arr.length*2 );
            }
            arr[idx++]= elem;
            size++;
        }


        public void set(int id, int element){ // to modify element at idex i;
            if(id>=0&&id<arr.length) arr[id]= element;
        }

        public int get(int id){ // to get/ or print elment at index id
            return arr[id];
        }

        public int size(){ // to find size
            return idx+1;
        } 

    }
   public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
        ArrayList arr = new ArrayList();
        arr.add(3);
        arr.add(4);
        arr.add(3);
        arr.add(5);
        arr.add(sc.nextInt());
        System.out.println(arr.get(2));
        System.out.println(arr.size);

    }
   } 
}
