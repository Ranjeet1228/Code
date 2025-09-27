
import java.util.Arrays;
public class arrayImplementation {

    private static class queueAr<T>{

        T[] arr = (T[]) new Object[10];        
        int f =-1;
        int b=-1;

        
        // to add element;
        public void add(T data){
            if(b==arr.length-1){
                arr= Arrays.copyOf(arr,arr.length*2);
            }

            if(f==-1){
                arr[0] = data;
                b++;
                f++;
            } else{
                arr[++b]= data;
            }
        }

        //to find top element
        T peek(){

            if(f==-1 || f>b){
                System.out.println("Out of index");
                return null;
            }
            T n = arr[f];
            return n;
        }

        // remove top element
        T remove(){
            if(f==-1 || f>b){
                System.out.println("Out of index");
                return null;
            } 
            T n = arr[f++];
            return n;
        }

        // find size of queue
        int size(){
            return b-f+1;
        }

        // print element of queue
        void print(){
            for(int i =f; i<=b; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        queueAr<Integer> q = new queueAr<>();
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        q.print();

        q.remove();
        q.print();
        System.out.println(q.size());
        System.out.println(q.peek());
    }
}