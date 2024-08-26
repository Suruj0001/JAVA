import java.util.ArrayList;
public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3, 3));
//        System.out.println(path("", 3, 3));
//        System.out.println(pathRetDiagonal("", 3, 3));
//[] define single arrys whereas [][] defines doubles arrays 
          boolean[][]  board = {
                  {true, true, true},
                  {true, false, true},
                  {true, true, true}
          };
          pathRestrictions("", board,0,0);
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathRetDiagonal("D", r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRetDiagonal("R", r, c - 1));
        }

        return list;
    }
// Ans : [R, R, D, R, D, D] shortest way if you want the correct location add +


    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }
// Ans : 6 there are 6 ways to rich to the destiny


    static char path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return 0;
        }
        if (r > 1) {
            path(p + "D", r - 1, c);
        }

        if (c > 1) {
            path(p + "R", r, c - 1);
        }
        return 0;
    }
    // Ans DDRR
    // DRDR
    //DRRD
    //RDDR
    //RDRD
    //RRDD

    static void pathRestrictions(String p, boolean[][] maze, int r , int c){
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }

        if (r < maze.length - 1){
            pathRestrictions(p + "D" , maze, r+1, c);
        }

        if (c < maze[0].length -1){
            pathRestrictions(p + "R" , maze, r, c+1);
        }
    }
    //Ans: DDRR
        //RRDD
}



