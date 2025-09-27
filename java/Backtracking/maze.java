import java.util.Scanner;

public class maze {
    public static int countPaths(int sr, int sc, int er, int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc ==ec){
            System.out.printf("(%d, %d)\n ",sr,sc);
            System.out.println();
            return 1;
        }
        System.out.printf("( %d, %d)   ",sr,sc);
        int down = countPaths(sr,sc+1, er,ec);
        int up = countPaths(sr+1, sc, er,ec);
        

        return down+up;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the no of row:- ");
            int row = sc.nextInt();

            System.out.print("Enter the no of col:- ");
            int col = sc.nextInt();

            int count = countPaths(1,1,row,col);
            System.out.println("The number of step count = " + count);
        }
    }
}
