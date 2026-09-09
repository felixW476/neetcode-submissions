class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // cliff is to the right of mid — discard left half including mid
                left = mid + 1;
            } else {
                 // no cliff between mid and right — cliff is at mid or to its left
                right = mid;
            }
        }

        return nums[left];
    }
}
