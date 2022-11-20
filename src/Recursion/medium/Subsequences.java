package Recursion.medium;
import java.util.*;

// https://www.codingninjas.com/codestudio/problems/subsequences-of-string_985087
public class Subsequences {
    public static void main(String[] args) {
        String sb = "abc";

        ArrayList<String> ls = subsequences(sb);

        System.out.println(ls);
    }

    public static ArrayList<String> subsequences(String str) {
        int index = 0;
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder("");

        solve(str, output, index, ans);

        return ans;
    }

    public static void solve(String str, StringBuilder output, int index, ArrayList<String> ans) {
        // base case
        if(index >= str.length()) {
            if(!(output.length()==0)) {
                ans.add(new String(output));
            }
            return;
        }

        StringBuilder exc = new StringBuilder(output);
        StringBuilder inc = new StringBuilder(output);

        // exclude
        solve(str, exc, index+1, ans);

        // include
        inc.append(str.charAt(index));
        solve(str, inc, index+1, ans);
    }
}
