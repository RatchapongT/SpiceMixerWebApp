public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        int m = needle.length();
        if (m == 0) return 0;
        int n = haystack.length();
        char[] pattern = needle.toCharArray();
        char[] string = haystack.toCharArray();
        Map<Character, Integer> lastTable = new HashMap<>();
        for (int i = 0; i < n; i++) {
            lastTable.put(string[i], -1);
        }
        for (int k = 0; k < m; k++) {
            lastTable.put(pattern[k], k);
        }
        int i = m - 1;
        int k = m - 1;
        while (i < n) {
            if (string[i] == pattern[k]) {
                if (k == 0) return i;
                i--;
                k--;
            } else {
                i = i + m - Math.min(k, 1 + lastTable.get(tring[i]));
                k = m - 1;
            }
        }
        return -1;
    }
}