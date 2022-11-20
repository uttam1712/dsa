package Recursion.medium;
import java.util.*;

// https://www.codingninjas.com/codestudio/problems/rat-in-a-maze_1215030
public class RatInMaze {
    public static void main(String[] args) {
        int[][] maz = {
                {1,0,0,0},
                {1,1,0,1},
                {1,1,0,0},
                {0,1,1,1}
        };

        System.out.println(findSum(maz, 4));
    }

    public static ArrayList<String> findSum(int[][] arr, int n) {
        ArrayList<String> ans = new ArrayList<>();

        // by default filled with zeros
        int[][] visited = new int[n][n];

        StringBuilder path = new StringBuilder("");

        solve(0, 0, visited, arr, ans, path);

        Collections.sort(ans);

        return ans;
    }

    public static void solve(int x, int y, int[][] visited, int[][] maz, ArrayList<String> ans, StringBuilder path) {

        // x == row, y == column

        if(maz[0][0] == 0) return;

        int n = maz.length;

        if(x == n-1 && y == n-1) {
            ans.add(new String(path));
            return;
        }

        // d, l, u, r

        visited[x][y] = 1;

        // down
        if(checkValidMove(n, x+1, y, visited, maz)) {
            path.append("D");
            solve(x+1, y, visited, maz, ans, path);
            path.deleteCharAt(path.length()-1);
        }

        // left
        if(checkValidMove(n, x, y-1, visited, maz)) {
            path.append("L");
            solve(x, y-1, visited, maz, ans, path);
            path.deleteCharAt(path.length()-1);
        }

        // up
        if(checkValidMove(n, x-1, y, visited, maz)) {
            path.append("U");
            solve(x-1, y, visited, maz, ans, path);
            path.deleteCharAt(path.length()-1);
        }

        // right
        if(checkValidMove(n, x, y+1, visited, maz)) {
            path.append("R");
            solve(x, y+1, visited, maz, ans, path);
            path.deleteCharAt(path.length()-1);
        }


        visited[x][y] = 0;
    }

    public static boolean checkValidMove(int n, int x, int y, int[][] visited, int[][] maz) {
        // in maze boundary
        // must be 1
        // must be not visited
        if(x >= 0 && x < n && y >= 0 && y < n && visited[x][y] == 0 && maz[x][y] == 1) return true;
        return false;
    }

}
