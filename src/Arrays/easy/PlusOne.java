package Arrays.easy;

// https://leetcode.com/problems/plus-one/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {7, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1 ; i >= 0 ; i--) {
            if(digits[i] == 9)
                digits[i] = 0;
            else {
                ++digits[i];
                return digits;
            }
        }

        int[] new_arr = new int[digits.length + 1];

        new_arr[0] = 1;

        return new_arr;
    }
}
