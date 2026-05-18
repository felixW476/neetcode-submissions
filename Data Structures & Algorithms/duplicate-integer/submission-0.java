class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (index == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}