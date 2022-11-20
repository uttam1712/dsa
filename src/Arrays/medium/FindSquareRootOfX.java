package Arrays.medium;

// https://leetcode.com/problems/sqrtx/

public class FindSquareRootOfX {
    public static void main(String[] args) {
        System.out.println(mySqrt(2));
    }

    public static int mySqrt(int x) {
        int s = 0, e = x / 2;
        int ans = -1;

        while(s<=e){
            int m = s + (e-s) / 2;

            if(m*m == x)
                return (int)m;
            else if(m*m > x)
                e = m - 1;
            else{
                ans = m;
                s = m + 1;
            }
        }

        return (int)ans;
    }
}
