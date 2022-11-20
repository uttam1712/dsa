package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 20, 15, 7, 9};

        System.out.println("Before sorted");
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("After sorted");
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min_idx])
                    min_idx = j;
            }

            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
}
