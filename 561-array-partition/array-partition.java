import java.util.*;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // sort the array
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i]; // take every 1st element of each pair
        }

        return sum;
    }
}
