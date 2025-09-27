//import com.sun.security.auth.module.LdapLoginModule;
import java.util.Scanner;
public class getFromLast {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter fout element of linkedList:- ");
            int a= sc.nextInt();
            int b = sc.nextInt();
            int c= sc.nextInt();
            int d= sc.nextInt();
            CustomLinkedList ll= new CustomLinkedList();
        
        ll.add(a);
        ll.add(b);
        ll.add(c);
        ll.add(d);
        ll.display();
        // to delete from the last we can say the term will be n= (m-n+1)
        System.out.print("Enter last term:- ");
        int last =sc.nextInt();
        int id=(ll.size-last)+1;
        System.out.println(ll.getAt(id));
        
        }

    }
}
