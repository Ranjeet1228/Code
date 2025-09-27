import java.util.Scanner;
public class butterflyPrint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n: - ");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            if(i<=n/2){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=(n-2*i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            }
            else if(i>n/2){
              int a=i-n/2;
              for(int j=1;j<=n/2-(a-1);j++){
                  System.out.print("* ");
              }
              for(int j=1;j<=2*(a-1);j++){
                  System.out.print("  ");
              }
              for(int j=1;j<=n/2-(a-1);j++){
                  System.out.print("* ");
              }
              System.out.println();
            }
        }

    }

}


