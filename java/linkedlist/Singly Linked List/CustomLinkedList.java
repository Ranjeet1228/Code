public class CustomLinkedList {
     Node head;
    Node tail;
    int size = 0;

    // Node definition (inner class)
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Add element at the end of the list
    public void add(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    // Add element at a specific index (1-based)
    public void addAtIdx(int idx, int data) {
        if (idx < 1 || idx > size + 1) {
            System.out.println("Invalid index.");
            return;
        }

        Node insert = new Node(data);

        if (idx == 1) { // Insert at head
            insert.next = head;
            head = insert;
            if (tail == null) tail = insert;
        } else {
            Node temp = head;
            for (int i = 1; i < idx - 1; i++) {
                temp = temp.next;
            }
            insert.next = temp.next;
            temp.next = insert;

            if (insert.next == null) tail = insert; // If added at end
        }

        size++;
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
    }

    // Get data at a specific index (1-based)
    public int getAt(int idx) {
        if (idx < 1 || idx > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // Delete first occurrence of a number
    public void delete(int num) {
        if (head == null) return;

        if (head.data == num) {
            head = head.next;
            size--;
            if (head == null) tail = null;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != num) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Element not found.");
            return;
        }

        temp.next = temp.next.next;
        if (temp.next == null) tail = temp;
        size--;
    }

    // function to get nth node from last
    public int nthFromLast(int n){
        Node fast = head;
        Node slow = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        while(fast !=null){
            fast= fast.next;
            slow = slow.next;
        }
        return slow.data;
    }

    // function to delete nth node from last 
    void deleteNthlast(int n){
        Node fast= head;
        Node slow = head;
        if(n<0|| n>size){
            System.out.println("Element not exist:- ");
            return;
        } if(n==size){
            head=head.next;
            size--;
            return;
        }else{
            for(int i=1;i<=n;i++){
                fast=fast.next;
            }
        }
        while(fast.next!=null){
            slow = slow.next;
            fast= fast.next;
        }
        slow.next= slow.next.next;
        size--;

    }
}