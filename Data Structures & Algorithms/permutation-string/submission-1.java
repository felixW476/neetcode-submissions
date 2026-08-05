class Solution {
    public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) return false;

    HashMap<Character, Integer> target = new HashMap<>();
    for (char c : s1.toCharArray()) {
        target.merge(c, 1, Integer::sum);
    }

    HashMap<Character, Integer> window = new HashMap<>();

    for (int right = 0; right < s2.length(); right++) {
        char rc = s2.charAt(right);
        window.merge(rc, 1, Integer::sum);

        if (right >= s1.length()) {
            char lc = s2.charAt(right - s1.length());
            window.put(lc, window.get(lc) - 1);
            if (window.get(lc) == 0) {
                window.remove(lc);
            }
        }

        if (right >= s1.length() - 1 && window.equals(target)) {
            return true;
        }
    }
    return false;
}
}
