class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); // stores indices
        int j = 0;

        for (int i = 0; i < n; i++) {
            // 1. pop from front if that index is outside the window
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // 2. pop from back while smaller than current — they're useless now
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // 3. push current index
            deque.offerLast(i);

            // 4. once window is full, front of deque = max
            if (i >= k - 1) {
                res[j++] = nums[deque.peekFirst()];
            }
        }

        return res;
    }
}
