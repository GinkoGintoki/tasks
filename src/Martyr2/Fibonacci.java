package Martyr2;

public class Fibonacci {
    public long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long[] nums = new long[n];
        nums[0] = 0;
        nums[1] = 1;

        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n-1];
    }
}
