import java.util.Scanner;

public class startingOfcycle {

    // Node class for the linked list
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
        }
    }

    // Function to find the starting point of the cycle in a linked list
    public static int stpoint(node head) {
        node fast = head;
        node slow = head;

        // Step 1: Detect cycle using Floyd's cycle detection algorithm
        while (fast != null && fast.next != null) {
            fast = fast.next.next; // move fast pointer by 2
            slow = slow.next;      // move slow pointer by 1

            if (fast == slow) break; // cycle detected
        }

        // Step 2: Move one pointer to the head and move both one step at a time
        // They will meet at the starting point of the cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast.data; // returning the data of the starting node of the cycle
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input 6 elements for the linked list
            System.out.print("Enter elements of linked list: ");
            node ll1 = new node(sc.nextInt());
            node ll2 = new node(sc.nextInt());
            node ll3 = new node(sc.nextInt());
            node ll4 = new node(sc.nextInt());
            node ll5 = new node(sc.nextInt());
            node ll6 = new node(sc.nextInt());

            // Creating the linked list
            ll1.next = ll2;
            ll2.next = ll3;
            ll3.next = ll4;
            ll4.next = ll5;
            ll5.next = ll6;

            // Making the list cyclic by connecting last node to the third node
            ll6.next = ll3;

            // Calling the function and printing the result
            System.out.println("Starting point of cycle: " + stpoint(ll1));
        }
    }
}