import java.util.Scanner;

public class PelindromNo {
   public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter string:- ");
       String sb= sc.nextLine();

        int count =0;

        for(int i=0;i<sb.length();i++){
            for(int j=i+1;j<=sb.length();j++){

                String st= sb.substring(i,j);

                String rev = new StringBuilder(st).reverse().toString();

                if(st.equals(rev)) count++;
            }

        }
        System.out.println(count);
    }
   } 
}