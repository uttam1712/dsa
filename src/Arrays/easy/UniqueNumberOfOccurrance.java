package Arrays.easy;

//  https://leetcode.com/problems/unique-number-of-occurrences/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrance {
    public static void main(String[] args) {

    }

    static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : arr) {
            if(map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }

        Set<Integer> set = new HashSet<>(map.values());

        return set.size() == map.size();
    }
}
