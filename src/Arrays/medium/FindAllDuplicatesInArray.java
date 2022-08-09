package Arrays.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {

    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;   // it's correct index of element

            if(nums[i] != nums[correct])
                swap(nums, i, correct);
            else
                i++;
        }

        for(int j = 0 ; j<nums.length ; j++){
            if(nums[j] != j+1)
                ans.add(nums[j]);
        }

        return ans;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
