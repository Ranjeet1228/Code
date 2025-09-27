class DublyLinkedList {
    
    class node {
        int data;       
        node next;
        node prev;     

        // Constructor to initialize the node
        node(int data) {
            this.data = data;
        }
    }

    node head; 
    node tail; 

    // Method to add element in doubly linked list
    void add(int data) {
        node tem = new node(data); // Create new node
        if (head == null) {        // If list is empty
            head = tem;
            tail = tem;
        } else {
            tail.next = tem;   // Link the tail to new node
            tem.prev = tail;   // Set previous of new node  tail
            tail = tem;        // Update tail to new node
        }
    }

    // Method to insert element at specific position
    void insert(int data, int position) {
        node tem = new node(data); // Create new node

        // If inserting at the beginning
        if (position == 0) {
            tem.next = head;
            if (head != null) {
                head.prev = tem;
            }
            head = tem;
            return;
        }

        node st = head;
        int i = 0;

        // Traverse to the position-1 node
        while (st.next != null && i < position - 1) {
            st = st.next;
            i++;
        }

        // If position is out of bounds
        if (st.next == null && i < position - 1) {
            System.out.println("Out of index");
            return;
        }

        // If inserting at the last position
        if (st.next == null && i == position - 1) {
            add(data);
            return;
        }

        // Inserting in between nodes
        st.next.prev = tem;
        tem.next = st.next;
        st.next = tem;
        tem.prev = st;
    }

    // Method to display the list from head to tail
    void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to delete element from a given index
    void delete(int idx) {
        // If deleting the head node
        if (idx == 0) {
            if (head.next != null) {
                head.next.prev = null;
                head = head.next;
            } else {
                head = head.next; // List becomes empty
            }
            return;
        }

        node tem = head;
        int i = 0;

        // Traverse to the node to be deleted
        while (tem.next != null && i < idx) {
            tem = tem.next;
            i++;
        }

        // If deleting the last node
        if (tem.next == null && idx == i) {
            tem.prev.next = null;
        }
        // If deleting a middle node
        else if (tem.next != null && i < idx) {
            tem.next.next.prev = tem;
            tem.next = tem.next.next;
        }
        // If index is invalid
        else {
            System.out.println("out of index:- ");
        }
    }
}