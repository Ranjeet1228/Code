public class basic {

    // Node class representing each element in the linked list
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Custom Linked List class
    public static class CustomLinkedList {
        Node head;
        Node tail;
        int size = 0;

        // Method to add element at the end of the list
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

        // Method to add element at a specific index
        public void addAtIdx(int idx, int data) {
            // Index validation
            if (idx < 0 || idx > size) {
                System.out.println("Invalid index.");
                return;
            }

            Node insert = new Node(data);

            // Insert at the head
            if (idx == 0) {
                insert.next = head;
                head = insert;
                // If list was empty, also update tail
                if (tail == null) {
                    tail = insert;
                }
                size++;
                return;
            }

            // Traverse to node before the desired index
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }

            insert.next = temp.next;
            temp.next = insert;

            // Update tail if added at the end
            if (insert.next == null) {
                tail = insert;
            }

            size++;
        }

        // Method to print the linked list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println();
        }

        // Method to get data at a specific index
        int getAt(int idx) {
            if (idx < 0 || idx >= size) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }

            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // Method to delete the first occurrence of a given number
        void delete(int num) {
            if (head == null) return;

            // Case: deleting head
            if (head.data == num) {
                head = head.next;
                size--;
                // If list becomes empty, reset tail
                if (head == null) {
                    tail = null;
                }
                return;
            }

            Node temp = head;

            // Traverse while the next node is not null and not the target
            while (temp.next != null && temp.next.data != num) {
                temp = temp.next;
            }

            // If element was not found
            if (temp.next == null) {
                System.out.println("Element not found.");
                return;
            }

            // Remove the node
            temp.next = temp.next.next;
            size--;

            // Update tail if last node was deleted
            if (temp.next == null) {
                tail = temp;
            }
        }
    }

    public static void main(String[] args) {
        CustomLinkedList ll = new CustomLinkedList();

        // Adding elements to the list
        ll.add(2);
        ll.add(45);
        ll.add(12);
        ll.add(54);
        ll.add(12);
        ll.add(3);
        ll.add(14);

        // Displaying list
        ll.display();

        // Inserting 23 at index 1
        ll.addAtIdx(1, 23);

        // Display list after insertion
        ll.display();

        // Get value at index 2
        System.out.println("Element at index 2: " + ll.getAt(2));

        // Deleting element 14
        ll.delete(14);

        // Display list after deletion
        ll.display();
    }
}