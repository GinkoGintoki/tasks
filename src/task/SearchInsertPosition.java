package task;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
            }
        }

        if (index == -1) {
            boolean isTrue = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > target) {
                    index = i;
                    isTrue = true;
                    break;
                }
            }
            if(!isTrue){
                index = nums.length;
            }
        }

        return index;
    }
}
