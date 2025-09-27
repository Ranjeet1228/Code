import java.util.Scanner;

public class mergetwoSorted {

    // Node class representing an element in the linked list
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
        }
    }

    // LinkedList class with basic functionality
    public static class LinkedList {
        node head;
        node tail;

        // Adds a new node to the end of the linked list
        public void add(int data) {
            node tem = new node(data);
            if (head == null) {
                head = tem;
                tail = tem;
            } else {
                tail.next = tem;
                tail = tem;
            }
        }
    }

    // Function to merge two sorted linked lists
    public static LinkedList merge(node head1, node head2) {
        node temp1 = head1; // pointer for first list
        node temp2 = head2; // pointer for second list
        LinkedList merger = new LinkedList(); // new list to store the result

        // Merge both lists by comparing their data values
        while (temp1 != null && temp2 != null) {
            if (temp1.data > temp2.data) {
                merger.add(temp2.data);
                temp2 = temp2.next;
            } else {
                merger.add(temp1.data);
                temp1 = temp1.next;
            }
        }

        // Add any remaining nodes from the first list
        while (temp1 != null) {
            merger.add(temp1.data);
            temp1 = temp1.next;
        }

        // Add any remaining nodes from the second list
        while (temp2 != null) {
            merger.add(temp2.data);
            temp2 = temp2.next;
        }

        return merger; // return the merged linked list
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Input first linked list
            System.out.print("Enter the size of first linked list: ");
            int size = sc.nextInt();
            LinkedList ll1 = new LinkedList();
            System.out.print("Enter " + size + " sorted elements: ");
            for (int i = 0; i < size; i++) {
                ll1.add(sc.nextInt());
            }

            // Input second linked list
            LinkedList ll2 = new LinkedList();
            System.out.print("Enter the size of second linked list: ");
            int size2 = sc.nextInt();
            System.out.print("Enter " + size2 + " sorted elements: ");
            for (int i = 0; i < size2; i++) {
                ll2.add(sc.nextInt());
            }

            // Merge both sorted lists
            LinkedList merge = merge(ll1.head, ll2.head);

            // Print the merged linked list
            System.out.print("Merged sorted linked list: ");
            node temp = merge.head;
            while (temp != null) {
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
        }
    }
}
