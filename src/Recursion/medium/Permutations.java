package Recursion.medium;
import java.util.*;

// https://leetcode.com/problems/permutations/
public class Permutations {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2};

        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans, 0, nums);

        return ans;
    }

    public static void solve(List<List<Integer>> ans, int index, int[] nums) {
        // base case
        if(index >= nums.length) {
            List<Integer> ls = new ArrayList<>();
            for(int e: nums) ls.add(e);
            ans.add(ls);
            return;
        }

        for(int i = index ; i<nums.length ; i++) {
            swap(nums, index, i);
            solve(ans, index+1, nums);

            // backtrack
            swap(nums, index, i);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
