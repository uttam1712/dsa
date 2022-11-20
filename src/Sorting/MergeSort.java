package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 20, 15, 7, 9};

        System.out.println("Before sorted");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length-1);

        System.out.println("After sorted");
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int s, int e) {
        if(s>=e)
            return;

        int mid = s + (e-s) / 2;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        merge(arr, s, mid, e);
    }

    public static void merge(int[] arr, int s, int mid, int e) {

        int n1 = mid-s+1;
        int n2 = e-mid;

        int[] l = new int[n1];
        int[] r = new int[n2];

        for (int i = 0; i < n1; i++)
            l[i] = arr[s+i];

        for (int i = 0; i < n2; i++)
            r[i] = arr[mid+1+i];

        int i = 0, j = 0, k = s;

        while(i<n1 && j<n2) {

            if(l[i] < r[j])
                arr[k++] = l[i++];
            else
                arr[k++] = r[j++];
        }

        while (i<n1)
            arr[k++] = l[i++];

        while (j<n2)
            arr[k++] = r[j++];
    }
}
