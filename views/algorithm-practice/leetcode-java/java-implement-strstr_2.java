public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        int m = needle.length();
        if (m == 0) return 0;
        char[] pattern = needle.toCharArray();
        char[] string = haystack.toCharArray();
        int[] failureTable = buildFailureTable(pattern);
        int i = 0;
        int j = 0;

        while (i < haystack.length()) {
            if (string[i] == pattern[j]) {
                if (j == m - 1) return i - m + 1;
                i++;
                j++;
            } else if (j > 0) {
                j = failureTable[j - 1];
            } else {
                i++;
            }
        }
        return -1;
    }

    public int[] buildFailureTable(char[] pattern) {
        int i = 1;
        int j = 0;

        int[] failureTable = new int[pattern.length];
        failureTable[0] = 0;
        while (i < pattern.length) {
            if (pattern[i] == pattern[j]) {
                failureTable[i] = j + 1;
                i++;
                j++;
            } else if (j > 0) {
                j = failureTable[j - 1];
            } else {
                failureTable[i] = 0;
                i++;
            }
        }
        return failureTable;
    }
}