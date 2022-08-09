package Arrays.medium;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {11, 13, 15, 17};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        int s = 0, e = nums.length - 1;
        while(s<e) {
            int m = s + (e-s) / 2;

            if(nums[m] >= nums[0] && nums[m] >nums[nums.length-1])
                s = m + 1;
            else
                e = m;
        }

        return nums[s];
    }
}
