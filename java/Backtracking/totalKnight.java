import java.util.Scanner;

public class totalKnight {
    static int number = 0;
    public static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;

        int i = row-2;
        int j = col-1;
        if(i>=0 && j>=0 &&board[i][j] == 'K') return false;

        i = row - 2;
        j = col+1;
        if(i>=0 && j<n && board[i][j] == 'K') return false;
        
        i = row+2;
        j = col-1;
        if(i<n && j>=0 && board[i][j] == 'K')return false;

        i = row+2;
        j = col+1;
        if(i<n && j<n&& board[i][j] == 'K')return false;

        i = row -1;
        j = col-2;
        if(i>=0 && j>=0 && board[i][j] == 'K')return false;

        i = row+1;
        j = col-2;

        if(i<n && j>=0 && board[i][j] == 'K')return false;

        i = row -1;
        j = col+2;
        if(i>=0 && j<n && board[i][j] == 'K')return false;

        i = row+1;
        j = col +2;

        if(i<n && j<n && board[i][j] == 'K')return false;

        return true;
    }

    public static void maxKnight(char[][] board, int row, int col, int num){
        int n = board.length;

        if(row == n){
            number++;
            System.out.println();
            for(int i =0; i<n; i++){
                for(int j = 0; j<n; j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            return;
        }

        if(isSafe(board, row, col)){
            board[row][col] = 'K';
            if(col != n-1) maxKnight(board, row, col+1, num+1);
            else maxKnight(board, row+1, 0, num+1);
            board[row][col] = 'X';
        }
        if(col != n-1) maxKnight(board, row, col+1, num);
        else maxKnight(board, row+1, 0, num);
    }



    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the total row");
            int n = sc.nextInt();
            char[][] board = new char[n][n];
            
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    board[i][j] = 'X';
                }
            }

            maxKnight(board,0,0,0);
            System.out.printf("Total num  = %d", number);
        }
    }
}