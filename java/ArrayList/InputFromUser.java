import java.util.ArrayList;
import java.util.Scanner;
public class InputFromUser{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of ArrayList:- ");
        int n = sc.nextInt();
        ArrayList <Integer>list = new ArrayList<>();
        for(int i= 0; i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        sc.close();
    }
    
}
