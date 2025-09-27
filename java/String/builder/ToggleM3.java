import java.util.Scanner;

public class ToggleM3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter String:- ");
            StringBuilder sb = new StringBuilder(sc.nextLine());

            for(int i=0;i<sb.length();i++){
                char ch= sb.charAt(i);

                if(ch>='a'&&ch<= 'z'){
                    sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                }
                else if(ch>='A'&& ch<='Z'){
                    sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
                }
            }
            System.out.println(sb);
        }
    }
}