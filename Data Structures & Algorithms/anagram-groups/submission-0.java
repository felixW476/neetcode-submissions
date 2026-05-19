class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<Map<Character, Integer>> mapList = new ArrayList<>();
        
        for (int i = 0; i < strs.length; i++) {
            Map<Character, Integer> freq = new HashMap<>();
            for (char c : strs[i].toCharArray()) {
                freq.put(c, freq.getOrDefault(c, 0) + 1); // increment if a diff char
            }
            mapList.add(freq);
        }

        boolean[] visited = new boolean[strs.length];
        for (int i = 0; i < mapList.size(); i++) {
            if (visited[i]) continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            for(int j = i+1; j < mapList.size(); j++) {
                if (!visited[j] && mapList.get(i).equals(mapList.get(j))) { 
                    group.add(strs[j]); // if it does equal the next arraylist of hash it will add to that grouping
                    visited[j] = true; // mark true so it doesnt repeat 
                }
            }
            result.add(group);
        }
        return result;
    }
}
