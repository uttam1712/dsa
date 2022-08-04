package Arrays.easy;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

import java.util.TreeSet;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums) {

//        TreeSet<Integer> set = new TreeSet<Integer>();
//        for(int elem : nums)
//            set.add(elem);
//
//        int n = set.size();
//
//        for (int i = 0; i < set.size(); i++) {
//            nums[i] = set.pollFirst();
//        }
//
//        return n;

        if(nums.length == 0) return 0;

        int i = 0, j = 1;

        for(; j < nums.length; j++) {
            if(nums[i] != nums[j])
                nums[++i] = nums[j];
        }

        return i+1;
    }
}
