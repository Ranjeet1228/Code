public class ratInDeadMazeOptimized {

    public static void print(int sr, int sc, int er, int ec, int[][] maze, String s){

        if (sr < 0 || sc < 0 || sr > er || sc > ec) return;

        if(sr == er && sc== ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc] ==0 || maze[sr][sc]==-1) return;

        maze[sr][sc] = -1;

        print(sr, sc+1, er,ec, maze, s+"R");
        print(sr+1, sc, er,ec, maze, s+"D");
        print(sr, sc-1, er,ec, maze, s+"L");
        print(sr-1, sc, er,ec, maze, s+"U");
        maze[sr][sc]=1;
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 4;
        int[][] maze ={{1, 0, 1, 1},
                       {1, 1, 1, 1},
                       {1, 1, 0, 1}
        };

        print(0,0, row-1, col-1, maze,"");
    }
}
