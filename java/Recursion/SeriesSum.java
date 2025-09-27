package java.Recursion;
import java.util.Scanner;
public class SeriesSum {
    public static int seriesSum(int n){
        if (n==0) return 0;
        return n+seriesSum(n-1);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        //;prompt the user to enter n
        System.out.print("Enter n:- ");
        int n= sc.nextInt();
        System.out.println(seriesSum(n));
        }

    }
}
