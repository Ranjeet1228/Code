import java.util.Scanner;

public class print {
    static void main() {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number:- ");
            int n = sc.nextInt();
            System.out.println(n*n);
        }
    }
}
