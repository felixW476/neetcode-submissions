class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s_map = new HashMap<Character, Integer>();
        HashMap<Character, Integer> t_map = new HashMap<Character, Integer>();

        for (char c: s.toCharArray()) {
            s_map.put(c, s_map.getOrDefault(c,0) + 1);
        }
        
        for (char c: t.toCharArray()) {
            t_map.put(c, t_map.getOrDefault(c,0) + 1);
        }

        if (s_map.equals(t_map)) {
            return true;
        }
        return false;
    }
}
