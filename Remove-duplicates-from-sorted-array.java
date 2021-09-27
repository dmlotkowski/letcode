class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {return 0;}
        int piwot = nums[0];
        int max = Arrays.stream(nums).max().getAsInt();

        for (int i = 1; i < nums.length; i++) {
            int check = nums[i];
            
            if (check == piwot) {
                nums[i] = max+1;
            } else {
                piwot = nums[i];
            }
        }
        
        Arrays.sort(nums);
        return Arrays.binarySearch(nums, max)+1;
    }
}
