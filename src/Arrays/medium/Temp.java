package Arrays.medium;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Temp {
    public static void main(String[] args) {
        List<List<Integer>> ls = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        ls.add(a1);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        ls.add(a2);

        System.out.println(new ArrayList<List <Integer>>(new LinkedHashSet<List<Integer>>(ls)));
    }
}
