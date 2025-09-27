import java.util.Scanner;

public class printing {
  public static void main(String[] args) {
      try(Scanner sc=new Scanner(System.in)){
      System.out.print("Enter name:- ");
      String name= sc.nextLine();
      System.out.print("Enter number of time to print:- ");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++){
        System.out.println(i+" "+name);
      }
    }
  }  
}
