
import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a String:- ");
            StringBuilder sb = new StringBuilder(sc.nextLine());
            for(int i=0,j=sb.length()-1;i<=j;i++,j--){
                char tem=sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, tem);
            }
            System.out.println(sb);
        }
    }
}
