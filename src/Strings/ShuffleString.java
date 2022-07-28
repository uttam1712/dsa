package Strings;

// https://leetcode.com/problems/shuffle-string/

public class ShuffleString {
    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3}));
    }

    static public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < indices.length; i++) {
            sb.setCharAt(indices[i], s.charAt(i));
        }

        return sb.toString();
    }
}
