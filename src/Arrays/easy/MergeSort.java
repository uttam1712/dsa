package Arrays.easy;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before sorted");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        mergeSort(arr, 0, arr.length-1);

        System.out.println("After sorted");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void mergeSort(int[] arr, int s, int e) {

        if(s>=e) return;

        int mid = s + (e-s) / 2;

        mergeSort(arr, 0, mid);
        mergeSort(arr, mid + 1, e);
        merge(arr, s, e, mid);
    }

    static void merge(int[] arr, int s, int e, int mid) {
        int[] a1 = new int[s + mid + 1];
        int[] a2 = new int[e - mid];

        int i = 0, j = 0;

        while(i<a1.length) {
            a1[i] = arr[s+i];
            i++;
        }

        while(j< a2.length) {
            a2[j] = arr[mid+1+j];
            j++;
        }

        i = 0;
        j = 0;
        int k = 0;

        while (i< a1.length && j < a2.length) {
            if(a1[i] < a2[j])
                arr[k++] = a1[i++];
            else
                arr[k++] = a2[j++];
        }

        while(i<a1.length) {
            arr[k++] = a1[i++];
        }

        while(j< a2.length) {
            arr[k++] = a2[j++];
        }

        return;
    }

}

