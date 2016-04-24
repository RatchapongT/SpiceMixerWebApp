public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        int m = needle.length();
        if (m == 0) return 0;
        int n = haystack.length();
        for (int i = 0; i <= n - m; i++) {
            int k = 0;
            while (k < m && haystack.charAt(i + k) == needle.charAt(k)) {
                k++;
            }
            if (k == m) return i;
        }
        return -1;
    }
}