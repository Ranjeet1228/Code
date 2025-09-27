import java.util.Random;
import java.util.Scanner;


public class random{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            Random rand = new Random();
            int n =0;
            do { 
                System.out.print(n+" ");
                n = rand.nextInt(100);
            } while (n!=0);
        }
    }
}