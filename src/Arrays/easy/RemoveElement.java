package Arrays.easy;

// https://leetcode.com/problems/remove-element/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
        System.out.println(Arrays.toString(nums));
    }

    static int removeElement(int[] nums, int val) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if(map.containsKey(nums[i]))
//                map.put(nums[i], map.get(nums[i]) + 1);
//            else
//                map.put(nums[i], 1);
//        }
//
//        map.remove(val);
//
//        int size = 0;
//        int i = 0;
//
//        for(Integer value : map.values())
//            size += value;
//
//        for(Integer key : map.keySet()){
//            for (int j = 0; j < map.get(key); j++) {
//                nums[i++] = key;
//            }
//        }
//
//        return size;

        // optimal

        int i = 0, j = 0;

        for(; i< nums.length; i++) {
            if(nums[i] != val)
                nums[j++] = nums[i];
        }

        return j;
    }
}
