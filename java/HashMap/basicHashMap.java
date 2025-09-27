import java.util.HashSet;
import java.util.Scanner;

public class basicHashMap {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            HashSet<Integer> st = new HashSet<>();

            System.out.print("Enter the number of set to be entered:- ");
            int size = sc.nextInt();

            System.out.printf("Enter the %d element :- \n",size);

            for(int i = 0; i < size; i++){
                st.add(sc.nextInt());
            }

            System.out.println("The element of set:- "+ st);
            System.out.println("the size of HashSet:- "+ st.size());

            System.out.println("Is it contains:- " + st.contains(13));

            st.remove(12);
            System.out.println(st);

            System.out.println();
            for(int el: st){
                System.out.print(el+" ");
            }

        }
    }
}
