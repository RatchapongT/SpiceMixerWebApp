public class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0;
        int j = 0;
        while (i < version1.length() || j < version2.length()) {

            int[] v1 = getVersion(version1, i);
            int[] v2 = getVersion(version2, j);
            i = v1[1];
            j = v2[1];
            if (v2[0] < v1[0]) {
                return 1;
            }
            if (v1[0] < v2[0]) {
                return -1;
            }
        }
        return 0;

    }

    public int[] getVersion(String s, int i) {
        int number = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                number = number * 10 + (c - '0');
            }
            i++;
            if (c == '.') {
                break;
            }
        }

        int[] result = new int[2];
        result[0] = number;
        result[1] = i;
        return result;
    }
}