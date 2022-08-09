package Arrays.medium;

// https://leetcode.com/problems/sort-colors/

public class SortColors {
    public static void main(String[] args) {
        int[] a = {2,0,2,1,1,0};
        sortColors(a);
        System.out.println(a);
    }

    public static void sortColors(int[] nums) {
        int i = 0, j = 0;

        // sort 0's
        while(i<nums.length && j < nums.length) {
            while(nums[j] != 0 && j < nums.length)
                j++;

            while(nums[i] == 0)
                i++;

            if(nums[i] != 0 && nums[j] == 0){
                swap(nums, i, j);
            }
        }

        // sort 1's

        i = 0;
        j = 0;
        while (nums[i] == 0) i++;
        while (nums[j] == 0) j++;

        while(i<nums.length && j < nums.length) {
            while(nums[j] != 1 && j< nums.length)
                j++;

            while(nums[i] == 1)
                i++;

            if(nums[i] != 1 && nums[j] == 1){
                swap(nums, i, j);
            }
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
