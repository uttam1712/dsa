package Arrays.medium;
import java.util.*;

// https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381876?leftPanelTab=0
public class QuickSortUsingDutchNationalFlag {
    public static void main(String[] args) {

    }

//    public static ArrayList<Integer> quickSortUsingDutchNationalFlag(ArrayList<Integer> arr) {
//
//    }

    public static void sort(ArrayList<Integer> list, int s, int e) {

        if(s>=e) return;

        int pi = partition(list, s, e);

        sort(list, s, pi-1);
        sort(list, pi+1, e);
    }

    public static int partition(ArrayList<Integer> list, int s, int e) {
        int pivot = list.get(e);

        int low = s, mid = s, high = e-1;

        while( mid < high ) {
            if(list.get(mid) < pivot) {
                swap(list, mid, low);
                low++;
                mid++;
            }
            else {
                swap(list, mid, high);
                high--;
            }
        }

        return mid;
    }

    public static void swap(ArrayList<Integer> ls, int i, int j) {
        int temp = ls.get(i);
        ls.set(i, ls.get(j));
        ls.set(j, temp);
    }
}
