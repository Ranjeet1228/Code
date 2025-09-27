import java.util.Scanner;

public class linkedListImplementation {

    private static class node{
        int val;
        node next;

        node(int val){
            this.val = val;
        }
    }

    private static class queuell{

        node head;
        node tail;

        int size =0;

        // add element 
        public void add(int data){
            node ll = new node(data);

            if(head == null){
                head = ll;
                tail = ll;
            } else{
                tail.next= ll;
                tail= tail.next;
            }

            size++;
        }


        //remove from 
        public int remove(){

            if(head== null){
                System.out.println("Queue is empty");
                return -1;
            }
            int value= head.val;
            head = head.next;
            size--;
            return value;
        }

        public int peek(){
            if(head== null){
                System.out.println("Queue is empty");
                return -1;
            }

            return head.val;
        }


        public boolean isEmpty(){

            if(head == null) return true;

            return false;
        }

        public void display(){
            node temp= head;

            System.out.println("The elements of Queues:- ");
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp= temp.next;
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            queuell q = new queuell();

            System.out.println(q.isEmpty());
            System.out.println("Enter size of an Queue:- ");
            int size = sc.nextInt();


            System.out.println("Enter size of queue:- ");
            for(int i =0; i<size; i++){
                q.add(sc.nextInt());
            }

            q.display();

            // remove top element
            q.remove();
            q.display();

            System.out.println("The peek element:- "+q.peek());
            System.out.println(q.isEmpty());

            System.out.println(q.size);

        }
    }
}