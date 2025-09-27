import java.util.HashSet;
import java.util.Scanner;

public class initial {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            System.out.println("Enter the size of ");
            int n = sc.nextInt();

            HashSet<Integer> mp = new HashSet<>();

            for(int i =0;i<n;i++){
                mp.add(sc.nextInt());
            }

            System.out.println(mp);


            System.out.println("Enter the number of element to be check:- ");
            System.out.println(mp.contains(sc.nextInt()));

            System.out.println("Enter the element to be removed:- ");
            System.out.println(mp.remove(sc.nextInt()));
        }
    }
}
