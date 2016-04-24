public class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        int distance = 2 * (numRows - 1); // distance between pipes |/|/|...
        char[] result = new char[s.length()];
        int k = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j = j + distance) {
                result[k++] = s.charAt(j);
                if (i > 0 && i < numRows - 1 && j + distance - 2 * i < s.length()) {
                    result[k++] = s.charAt(j + distance - 2 * i); // extra character between pipes
                }
            }
        }
        return new String(result);
    }
}