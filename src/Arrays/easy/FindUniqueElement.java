package Arrays.easy;

// https://www.codingninjas.com/codestudio/problems/find-unique625159

import java.util.HashMap;
import java.util.Map;

public class FindUniqueElement {
    public static void main(String[] args) {

    }

    static int findUnique(int[] arr){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i : arr) {
            if(map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1)
                return entry.getKey();
        }

        return -1;
    }
}
