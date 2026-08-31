class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        int n = position.length;
        
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> position[b] - position[a]);

        for (int i : idx) {
            double mph = (double) (target - position[i]) / speed[i];

            if (stack.isEmpty() || mph > stack.peek()) {
                stack.push(mph);
            }

        }
        System.out.println(stack);
        return stack.size();
    }
}
