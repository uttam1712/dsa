package Strings;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/count-the-number-of-consistent-strings/

public class NumberOfConsistentStrings {
    public static void main(String[] args) {
        String  allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};

        System.out.println(countConsistentStrings(allowed, words));
    }

    static public int countConsistentStrings(String allowed, String[] words) {

        int count = 0;

        Set<Character> set = new HashSet<>();

        for(char c : allowed.toCharArray()) {
                set.add(c);
        }

        for(String word : words) {

            boolean isConsistent = true;

            for(char c : word.toCharArray()) {
                if(!set.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }

            if(isConsistent == true) count++;
        }

        return count;
    }
}
