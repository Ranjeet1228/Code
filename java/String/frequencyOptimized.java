import java.util.Scanner;
public class frequencyOptimized {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.next();
            String ans = "" + str.charAt(0);
            int count = 1;

            for (int i = 1; i<str.length(); i++) {
                if(str.charAt(i) == str.charAt(i - 1)) {
                    count++; // increase count until another character meet
                } else {
                    ans += count;// add count in ans = a3
                    count = 1; // again made it 1 for another iteration
                    ans += str.charAt(i); // add charcter 
                }
            }
            ans += count; // add the remaining element in ans

            System.out.println("Compressed String: " + ans);
        }
    }
}
