package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 20, 15, 7, 9};

        System.out.println("Before sorted");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("After sorted");
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int j = i - 1;
            int current = arr[i];

            while (j>=0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }
    }
}
