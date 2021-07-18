package leetcode;

public class MaximumSubarray {
    public static int maxSubarray(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int max = nums[0];
        int prevSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (prevSum + nums[i] > nums[i]) {
                prevSum += nums[i];
            } else {
                prevSum = nums[i];
            }
            max = Math.max(max, prevSum);
        }

        return max;
    }
}
