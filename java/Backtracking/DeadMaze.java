public class DeadMaze {
    public static int maze(int sr, int sc, int er, int ec, int[][] isvisited){
        if(sr>er || sc>ec) return 0;
        if(sr == er && sc == ec) return 1;
        if(isvisited[sr][sc] == 0 ) return 0;

        int top = maze(sr+1, sc, er, ec,isvisited);
        int right = maze(sr,sc+1, er,ec,isvisited);

        return top+right;
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 4;

        int[][] arr = {{1,1,0,1},
                       {1,1,1,1},
                       {1,1,0,1}};
        
        int maze = maze(0,0, row-1, col-1, arr);
        System.out.println(maze);
    }
}