import java.util.Scanner;
public class lastNthTerm{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            CustomLinkedList ll = new CustomLinkedList();
            int a = sc.nextInt();
            int b= sc.nextInt();
            int c = sc.nextInt();
            int d= sc.nextInt();
            int e = sc.nextInt();
            ll.add(a);
            ll.add(b);
            ll.add(c);
            ll.add(d);
            ll.add(e);
            System.out.println("Number from last  3 is:- "+ll.nthFromLast(3));
        }
    }
}