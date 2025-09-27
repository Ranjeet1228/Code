import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQuery {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<ArrayList<Integer>>list = new ArrayList<ArrayList<Integer>>(); // create 2D arrayList
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of query:- ");
        int query = sc.nextInt();

        for(int i =0;i<query;i++){
           ArrayList<Integer>row= new ArrayList<>(); // make new ArrayList 
           System.out.printf("Enter the size of index %d",i);
            int size = sc.nextInt();
            for(int j=0;j<size;j++){
               row.add(sc.nextInt()); 
            }
            list.add(row);// store the arraylist into 2D arrayList
        }
        System.out.print("Enter number of querry:- ");
        int qu = sc.nextInt();
        for(int i =1;i<= qu;i++){
            System.out.print("Enter row and col number:- ");
            int l = sc.nextInt()-1;
            int r= sc.nextInt()-1;
            if (l < 0 || l >= list.size() || r < 0 || r >= list.get(l).size())  System.out.println("ERROR!");
            else System.out.println(list.get(l).get(r));
        }
    }
}
