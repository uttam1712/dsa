package Arrays.easy;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstAndLastPosition {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = new int[2];

        ans[0] = binarySearchL(nums, target);
        ans[1] = binarySearchL(nums, target);

        return ans;
    }

    public int binarySearchL(int[] arr, int target) {

        int s = 0;
        int e = arr.length-1;
        int ans = -1;

        while(s<=e) {
            int mid = ((e - s) / 2) + s;

            if(arr[mid] > target)
                e = mid - 1;
            else if(arr[mid] < target)
                s = mid + 1;
            else {
                ans = mid;
                e = mid - 1;
            }
        }

        return ans;
    }

    public int binarySearchR(int[] arr, int target) {

        int s = 0;
        int e = arr.length-1;
        int ans = -1;

        while(s<=e) {
            int mid = ((e - s) / 2) + s;

            if(arr[mid] > target)
                e = mid - 1;
            else if(arr[mid] < target)
                s = mid + 1;
            else{
                ans = mid;
                s = mid + 1;
            }
        }

        return ans;
    }
}
