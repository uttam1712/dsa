package Arrays.easy;

import java.util.ArrayList;

// https://www.codingninjas.com/codestudio/problems/duplicate-in-array_893397

public class DuplicateInArray {
    public static void main(String[] args) {

    }

    public static int findDuplicate(ArrayList<Integer> arr) {
        Integer sum = 0;
        for(Integer i : arr) {
            sum += i;
        }

        return sum - (arr.size() * (arr.size() - 1) / 2);
    }
}
