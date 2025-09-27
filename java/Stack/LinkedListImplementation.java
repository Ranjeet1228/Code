import java.util.Scanner;

public class LinkedListImplementation {
    private static class Stack{
        public static class node{
            int data;
            node next;
            node(int data){
                this.data = data;
            }
        }

        private node top;
        private int idx=0;

        void push(int data){
            node temp = new node(data);
            
                temp.next = top;
                top = temp;
                idx++;
        }

        int pop(){
            if(top== null){
                System.out.println("No element present");
                return -1;
            }

            int val = top.data;
            top = top.next;
            idx--;
            return val;
        }


        int peek(){
            if(top == null){
                System.out.println("No element fount");
                return -1;
            }
            return top.data;
        }

        boolean isEmpty(){
            return top== null;
        }

        int size(){
            return idx;
        }
        void displayll(node tem){
                if(tem == null) return;
                displayll(tem.next);
                System.out.print(tem.data+" ");
        }
        void display(){
            node tem = top;
            System.out.println("Elements are:- ");
            displayll(tem);
            System.out.println();   
            }
    }
    public static void main(String[] args) {

        try(Scanner sc = new Scanner (System.in)){
            Stack st = new Stack();
            System.out.print("Enter size of stack:- ");
            int size = sc.nextInt();

            System.out.println("Enter element of Stack:- ");
            for(int i=0;i<size; i++){
                st.push(sc.nextInt());
            }

            st.display();

            System.out.println("Element at top :- "+ st.peek());

            System.out.println("Element at top and remove:- "+ st.pop());

           
            st.display();

            System.out.println("Size of stack:- "+ st.size());

            System.out.println("Stack is empty or not:- "+ st.isEmpty());
        }
        
    }
}