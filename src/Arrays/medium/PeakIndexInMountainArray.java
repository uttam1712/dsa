package Arrays.medium;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakIndexInMountainArray {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {

        int ans = -1;
        int s = 0;
        int e = arr.length - 1;

        while(s<=e) {
            int m = s + (e-s) / 2;

            if(arr[m-1] < arr[m] && arr[m] > arr[m+1])
                return m;
            else if(arr[m] > arr[m+1])
                e = m;
            else if(arr[m] < arr[m+1])
                s = m+1;
        }

        return ans;
    }
}
