class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int index = 0;
        boolean indexPrepared = false;

        for (int i = 0; i < nums.length ; i ++) {

            if (!indexPrepared) {
                if (nums[i] > target) {
                    index = i;
                    indexPrepared = true;
                } else if (nums[nums.length - 1] < target) {
                    index = nums.length;
                    indexPrepared = true;
                }
            }

            if (nums[i] == target) {
                return i;
            } else if (i == nums.length - 1) {
                return index;
            }
        }
        
        return index;
    }
}
