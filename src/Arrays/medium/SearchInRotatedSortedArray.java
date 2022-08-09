package Arrays.medium;

// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(search(nums, 2));
    }

    public static int search(int[] nums, int target) {
        int pivot = findMin(nums);
        if(nums[pivot] <= target && target <= nums[nums.length - 1])
            return binarySearch(nums, pivot, nums.length - 1, target);
        else
            return binarySearch(nums, 0, pivot - 1, target);
    }

    public static int binarySearch(int[] a, int s, int e, int target) {
        while(s<=e) {
            int m = s + (e - s) / 2;

            if(a[m] == target)
                return m;
            else if(a[m] > target)
                e = m - 1;
            else
                s = m + 1;
        }

        return -1;
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

        return s;
    }
}
