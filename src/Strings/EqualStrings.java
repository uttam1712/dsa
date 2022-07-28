package Strings;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

public class EqualStrings {
    public static void main(String[] args) {
        boolean ans = arrayStringsAreEqual(new String[] {"ab", "c"},new String[] {"a", "bc"});
        System.out.println(ans);
    }

    static public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }


        for (int i = 0; i < word2.length; i++) {
            sb2.append(word2[i]);
        }


        return sb1.toString().equals(sb2.toString());
    }
}
