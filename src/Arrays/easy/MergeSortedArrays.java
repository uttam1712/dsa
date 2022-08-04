package Arrays.easy;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int k = 0;

        int i = 0, j = 0;

        while(i<m && j<n) {
            if(nums1[i] > nums2[j])
                ans[k++] = nums2[j++];
            else if(nums1[i] < nums2[j])
                ans[k++] = nums1[i++];
            else
                ans[k++] = nums1[i++];
        }

        while(i<m)
            ans[k++] = nums1[i++];

        while(j<n)
            ans[k++] = nums2[j++];

        for (int l = 0; l < m + n; l++) {
            nums1[l] = ans[l];
        }

    }
}
