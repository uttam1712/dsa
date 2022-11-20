package Arrays.medium;

import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        List<List<Integer>> ls = subsets(nums);
        System.out.println(ls);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        solve(nums, output, 0, ans);

        return ans;
    }

    public static void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {

        // base case
        if(index >= nums.length){
            ans.add(output);
            return;
        }

        List<Integer> copyForInclude = new ArrayList<>(output);
        List<Integer> copyForExclude = new ArrayList<>(output);

        // exclude
        solve(nums, copyForExclude, index+1, ans);

        // include
        copyForInclude.add(nums[index]);
        solve(nums, copyForInclude, index+1, ans);
    }
}
