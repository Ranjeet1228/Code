package java.Recursion;
import java.util.Scanner;
public class printnnumber{
    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)){
        System.out.println("Enter n:- ");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
    }
    }
    
}
