class Solution {
    public boolean helper(char[] group) {
        Set<Character> grouping = new HashSet<>();
        System.out.println(Arrays.toString(group));

        for (char row : group) {
            if (row == '.') { 
                continue;
            }

            if (!grouping.add(row)) { // reture false if there is a duplicate in the set
                return false;
            }
            grouping.add(row);
        }

        return true; 
    }

    public boolean isValidSudoku(char[][] board) {
        char[] group = new char[9];
        
        // rows check
        for (int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                
                group[col] = board[row][col];
            }
            if (!helper(group)) return false;
        }

        System.out.println("row check");
        
        // col check
        for (int col = 0; col < board[0].length; col++) {
            for (int row = 0; row < board.length; row++) {
                group[row] = board[row][col];
            }
            if (!helper(group)) return false;
        }
         System.out.println("col check");

        // 3x3 check
        for (int boxRow = 0; boxRow < 3; boxRow++) { // iterate over the boxes
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                for (int row = 0; row < 3; row++) { // iterates over the 3x3 slots
                    for (int col = 0; col < 3; col++) {
                        group[row * 3 + col] = board[boxRow * 3 + row][boxCol * 3 + col];
                    }
                }
                if (!helper(group)) return false;
            }
        }

        System.out.println("3x3 check");
        return true;
    }
}

