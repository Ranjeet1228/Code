import java.util.Scanner;

public class dimond {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //enter the value of n
        System.out.print("enter n: - ");
        int n=sc.nextInt();
        sc.close();
        //uper end
        for(int i=1;i<=n;i++){
            //space printing
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");//1 space
            }
            //print the value of i along with space 
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }System.out.println();//for new line 
        }
        // lower end
        for(int i=1;i<=n;i++){
            //for space printing
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
           //for star printing
           for(int j=1;j<=2*(n-i)+1;j++){
               System.out.print("* ");
           }
           System.out.println();
        }

    }

}
