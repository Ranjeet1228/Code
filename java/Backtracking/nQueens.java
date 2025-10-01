import java.util.Scanner;
public class nQueens{

    public static void display(char[][] board){
        for (char[] board1 : board) {
            for (int j = 0; j<board.length; j++) {
                System.out.print(board1[j]);
            }
            System.out.println();
        }
    }

    public static void nqueen(char[][] board, int row){
        if(row== board.length){
            display(board);
            System.out.println();
            return;
        }

        for(int i =0; i<board.length; i++){
            if(isSafe(board,row, i)){
                board[row][i] = 'Q';
                nqueen(board, row+1);
                board[row][i] = 'X';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col){
        int n =  board.length;
        // Check column
        for(int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') return false;
        }


        // Check row
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') return false;
        }


        //Northeast
        int i =row ,j = col;
        while(i>=0 && j<n){
            if(board[i][j] =='Q')return false;
            i--;
            j++;
        }

        //southwest
        i = row;
        j = col;
        while(i<n && j<n){
            if(board[i][j] =='Q')return false;
            i++;
            j++;
        }

        //southWest

        i = row;
        j = col;

        while(i<n && j>=0){
            if(board[i][j] =='Q')return false;
            i++;
            j--;
        }

        //Northwest
        i= row;
        j= col;

        while(i>=0 && j>=0){
            if(board[i][j] =='Q')return false;
            i--;
            j--;
        }
        

        return true;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number size of board: - ");
            int n = sc.nextInt();

            char[][] board = new char[n][n];

            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    board[i][j] = 'X';
                }
            }

            nqueen(board, 0);

        }
    }
}