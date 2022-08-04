package Strings.easy;

// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

public class FinalValueOfVariableAfterOperation {
    public static void main(String[] args) {

    }

    static public int finalValueAfterOperations(String[] operations) {

        int x = 0;

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "++X":
                  ++x;
                  break;

                case "X++":
                  x++;
                  break;

                case "--X":
                  --x;
                  break;

                case "X--":
                  x--;
                  break;
            }
        }

        return x;
    }
}
