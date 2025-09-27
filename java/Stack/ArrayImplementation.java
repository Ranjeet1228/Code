 import java.util.Scanner;
 public  class ArrayImplementation{
    private static class Stack{

        int[] arr;
        private int idx= 0;

        private  Stack(int size){
            arr= new int[size];
        }

        void push(int x){

            if(isFull()){
                System.out.println("Stack overflow");
                return;
            }
            arr[idx++]=x;
        }

        int peek(){
            if(idx==0){
                System.out.println("No element present");
                return Integer.MIN_VALUE;
            }
            return arr[idx-1];
        }

        int pop(){
            if(idx==0){
                System.out.println("No element is present");
                return Integer.MIN_VALUE;
            }
            int top =arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }

        void display(){
            System.out.println("Stack element:- ");
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }


        boolean isEmpty(){
            return idx==0;
        }

        boolean isFull(){
           return idx==arr.length;
        }
    }


    public static void main(String [] args){
       try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter size of Stack:- ");
        int size = sc.nextInt();

        Stack st = new Stack(size);

        System.out.println("Enter element of Stack:- ");
        for(int i=0; i<size; i++){
            st.push(sc.nextInt());
        }


        st.display();
        System.out.println("Element of top:- "+st.pop());

        System.out.println("Element at top:- "+st.peek());

        System.out.println("Size :-  "+ st.size());

        System.out.println("Stack is empty:- "+st.isEmpty());

        System.out.println("Stack is full:- "+st.isFull());
        
       } 
    }
}