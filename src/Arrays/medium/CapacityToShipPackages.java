package Arrays.medium;

// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

public class CapacityToShipPackages {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr = {3,2,2,4,1,4};
        System.out.println(shipWithinDays(arr, 3));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int ans = -1;
        int s = 0;
        int sum = 0;

        for(int e: weights)
            sum += e;

        int e = sum;

        while(s<=e) {
            int mid = s + (e-s) / 2;

            if(isCapable(weights, days, mid)){
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    public static boolean isCapable(int[] weights, int days, int mid) {
        int weightSum = 0;
        int day = 1;

        for (int i = 0; i < weights.length; i++) {
            if(weightSum + weights[i] <= mid) {
                weightSum += weights[i];
            } else {
                day++;
                if(day > days || weights[i] > mid){
                    return false;
                }
                weightSum = weights[i];
            }
        }

        return true;
    }
}
