package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int idx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[idx]) {
                idx++;
                nums[idx] = nums[i];
            }
        }
        return idx + 1;
    }
}
