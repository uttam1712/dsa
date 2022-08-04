package Arrays.easy;

// https://leetcode.com/problems/first-missing-positive/

public class FirstMissionPositive {
    public static void main(String[] args) {

    }

    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int N = nums.length;
        while(i < N){
            int correct = nums[i] - 1;

            // Ignore (-ve) numbers
            if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correct])
                swap(nums, i, correct);
            else
                i++;
        }

        int j = 0;
        while(j < nums.length){
            if(nums[j] != j + 1)
                return j + 1;
            j++;
        }

        return nums.length + 1;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
