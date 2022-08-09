package Arrays.medium;

import java.util.*;

// https://leetcode.com/problems/3sum/

public class ThreeSum {
    public static void main(String[] args) {
//        int[] arr = {1, 2, -2, -1};
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> ls = threeSum(arr);
        System.out.println(ls);
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int sum = 0 - nums[i];
                int s = i+1, e = nums.length - 1;
                while (s<e) {
                    if(nums[s] + nums[e] == sum) {
                        ls.add((Arrays.asList(nums[i], nums[s], nums[e])));

                        while(s<e && nums[s] == nums[s+1]) s++;
                        while(s<e && nums[e] == nums[e-1]) e--;

                        s++; e--;
                    }
                    else if(nums[s] + nums[e] < sum) s++;
                    else e--;
                }
            }
        }

        return ls;
    }
}
