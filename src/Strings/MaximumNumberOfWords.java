package Strings;

// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

public class MaximumNumberOfWords {
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        
        int ans = mostWordsFound(sentences);

        System.out.println(ans);
    }

    static public int mostWordsFound(String[] sentences) {
        
        int max = 0;

        for (int i = 0; i < sentences.length; i++) {
            int temp = sentences[i].split(" ").length;
            max = temp > max ? temp : max;
        }

        return max;
    }
}
