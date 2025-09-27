import java.util.Scanner;

public class reverseEachWord {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter an string:- ");
            String str = sc.nextLine();

            String ans = "";
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<str.length();i++){
                char ch= str.charAt(i);
                if(ch !=' '){
                    sb.append(ch);
                } else {
                    sb.reverse();
                    ans+=sb;
                    ans+=" ";
                    sb.delete(0,sb.length());
                }
            }
            sb.reverse();
            ans+=sb;
            System.out.println(ans);
            
        }
    }
}
