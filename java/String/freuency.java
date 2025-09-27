import java.util.Scanner;
public class freuency {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)){
            System.out.print("Enter String:- ");
            String str = sc.next();
            String ans = "";
            int i=0;
            while(i<str.length()){
                ans+=str.charAt(i);
                int count=1;
                while((i+1)<str.length()&&str.charAt(i)==str.charAt(i+1)){
                    count++;
                    i++;
                } ans+=count;
                i++;
            }
            System.out.println(ans);
        }
    }
}
