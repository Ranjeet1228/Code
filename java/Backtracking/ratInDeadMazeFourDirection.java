public class ratInDeadMazeFourDirection {

    public static void print(int sr, int sc , int er, int ec,int[][] maze,boolean[][] isvisited,String s){
        if(sr>er || sc>ec) return;
        if(sr<0 || sc<0) return;
        if(sr==er && sc == ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        if(isvisited[sr][sc]) return;

        isvisited[sr][sc] = true;

        print(sr, sc+1, er,ec,maze, isvisited,s+"R");
        print(sr+1,sc, er,ec,maze,isvisited,s+"D");
        print(sr,sc-1,er, ec,maze, isvisited, s+"L");
        print(sr-1, sc, er, ec,maze, isvisited, s+"U");
        isvisited[sr][sc] = false;
    }

     public static void main(String[] args) {
        int row = 3;
        int col = 4;
        int[][] maze ={{1,0,1,1},
                        {1,1,1,1},
                        {1,1,0,1}
        };
        boolean[][] visited = new boolean[row][col];

        print(0,0, row-1, col-1, maze,visited,"");

    }
}
