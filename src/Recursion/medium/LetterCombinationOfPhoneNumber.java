package Recursion.medium;
import java.util.*;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombinationOfPhoneNumber {
    public static void main(String[] args) {
        String str = "23496";

        System.out.println(letterCombinations(str));
    }

    public static void solve(List<String> ans, StringBuilder output, int index, String digits, String[] map) {

        if(index >= digits.length()) {
            if(!(output.length()==0)) ans.add(new String(output));
            return ;
        }

        int num = digits.charAt(index) - '0';
        String value = map[num];

        for(int i = 0 ; i<value.length() ; i++) {
            output.append(value.charAt(i));
            solve(ans, output, index+1, digits, map);
            output.deleteCharAt(output.length() - 1);
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder("");

        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        solve(ans, output, 0, digits, map);

        return ans;
    }
}
