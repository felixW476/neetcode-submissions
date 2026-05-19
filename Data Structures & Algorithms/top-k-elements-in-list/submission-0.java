class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> pair = new HashMap<>(); // key: number, val: freq
        int[] result = new int[k];

        for (int num : nums) {
            pair.put(num, pair.getOrDefault(num, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(pair.entrySet());
        Collections.sort(entries, (a,b) -> b.getValue() - a.getValue());

        for (int i = 0; i < k; i++) {
            result[i] = entries.get(i).getKey();
        }
        return result;
    }
}
