package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 20, 15, 7, 9};

        System.out.println("Before sorted");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("After sorted");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1])
                    swap(arr, j, j+1);
            }
        }

    }

    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
