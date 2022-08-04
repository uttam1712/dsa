package Arrays.medium;

// https://leetcode.com/problems/find-the-duplicate-number/solution/

public class FindDuplicateInArray {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] nums) {

        // approach 1
        // Using direct sorting logic which takes O(nLog(n)) complexity
        // Arrays.sort(nums);
        // for(int i = 0 ; i<nums.length-1 ; i++){
        //     if(nums[i]==nums[i+1])
        //         return nums[i];
        // }
        // return -1;

        // Using cyclic sort which take O(n) complexity

        // approach 2
//        int i = 0;
//        while(i<nums.length){
//            if(nums[i] != i+1){
//                int correct = nums[i] - 1;
//                if(nums[i] != nums[correct])
//                    swap(nums, i, correct);
//                else
//                    return nums[i];
//            }
//            else
//                i++;
//        }
//        return -1;

        // approach 3
//        int curr;
//        for (int i = 0; i < nums.length; i++) {
//            curr = nums[i];
//
//            if(nums[Math.abs(curr)] < 0)
//                return Math.abs(curr);
//            else
//                nums[Math.abs(curr)] *= -1;
//        }
//
//        return -1;

        // approach 4

        while(nums[0] != nums[nums[0]]) {
            int temp = nums[0];
            nums[0] = nums[nums[0]];
            nums[nums[0]] = temp;
        }

        return nums[0];
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
