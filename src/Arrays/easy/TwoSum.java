package Arrays.easy;

// https://leetcode.com/problems/two-sum/

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int x = target - curr;

            if(hm.containsKey(x))
                return new int[] {i, hm.get(x)};

            hm.put(nums[i], i);
        }

        return null;
    }


}
