class Solution {
    public int removeElement(int[] nums, int val) {
        
        int len = nums.length;
        
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == val) {
                nums[i] = Arrays.stream(nums).max().getAsInt();
                len = len - 1;
            }
        }
        
        Arrays.sort(nums);
        return len;
    }
}
