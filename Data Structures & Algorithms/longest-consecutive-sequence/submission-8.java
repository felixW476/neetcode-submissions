class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet =  new HashSet<>();
        int output = 1;
        
        if (nums.length == 0) {
            return 0;
        }

        for (int num : nums) {
            numSet.add(num);
        }
        
        int max = 0;
        for (Integer num : numSet) {
            if (!numSet.contains(num - 1)) { // there exist a set 
                int length = 1;
                while(numSet.contains(num +1)) {
                    length++;
                    num++;
                }
                max = Math.max(max, length);
            }
        }
        return max;
    }
}
