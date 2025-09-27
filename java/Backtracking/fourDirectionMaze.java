import java.util.Scanner;

public class fourDirectionMaze {

    public static int countMaze(int sr, int sc, int er, int ec, boolean[][] isvisited){
        if(sr==er && sc==ec){
            System.out.printf("(%d,%d)\n",sr,sc);
            return 1;
        }
        if(sr>er ||sc > ec) return 0;
        if(sr<0 || sc<0) return 0;
        if(isvisited[sr][sc]) return 0;

        isvisited[sr][sc] = true;
        System.out.printf("(%d,%d) ",sr,sc);
        int right = countMaze(sr, sc+1, er, ec, isvisited);
        
        int down = countMaze(sr+1, sc, er, ec, isvisited);

        int top = countMaze(sr-1, sc, er, ec, isvisited);

        int left = countMaze(sr, sc-1, er, ec, isvisited);
        int count = top + down + right + left;

        isvisited[sc][sr] = false;

      
        return count;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter no of row:- ");
            int row = sc.nextInt();

            System.out.print("Enter no of column:- ");
            int col = sc.nextInt();

            boolean[][] arr = new boolean[row][col];
            System.out.println(arr[0][0]);

            int count = countMaze(0, 0, row-1, col-1, arr);

            System.out.println("The number of way we can go to end:- "+ count);
        }
    }
}