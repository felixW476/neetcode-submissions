class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = rows * cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int mid_row = mid / cols;
            int mid_cols = mid % cols;
            int midVal = matrix[mid_row][mid_cols];

            if (midVal == target) {
                return true;
            }

            if (midVal < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;


    }
}
