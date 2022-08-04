package Arrays.easy;

//

import java.util.ArrayList;

public class IntersectionOf2Arrays {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;

        while(i < n && j < m) {
            if(arr1.get(i) < arr2.get(j))
                i++;
            else if(arr1.get(i) > arr2.get(j))
                j++;
            else{
                ans.add(arr1.get(i));
                i++;
                j++;
            }
        }

        return ans;
    }
}
