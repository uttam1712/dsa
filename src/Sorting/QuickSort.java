package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 20, 15, 7, 9};

        System.out.println("Before sorted");
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length-1);

        System.out.println("After sorted");
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int s, int e) {

        if(s>=e)
            return;

        int pIndex = partitionIndex(arr, s, e);

        quickSort(arr, s, pIndex-1);
        quickSort(arr, pIndex+1, e);

    }

    public static int partitionIndex(int[] arr, int s, int e) {

        // last element as pivot
        int pivot = arr[e];

        // indicate right position of pivot
        int i = s-1;

        for (int j = s; j <= e-1; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, e);

        return i+1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
