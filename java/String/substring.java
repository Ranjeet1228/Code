import java.util.Scanner;
public class substring {
  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter string:- ");
        String str= sc.nextLine();
        sc.nextLine();
        for(int i=0;i<=str.length()-1;i++){
         // System.out.print(str.charAt(i)+" ");
            for(int j=i;j<=str.length();j++)
            System.out.print(str.substring(i,j)+" ");
        }
    }
  }  
}