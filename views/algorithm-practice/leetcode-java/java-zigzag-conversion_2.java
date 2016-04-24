public class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        boolean down = true;

        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }
        int j = 0;
        while (j < s.length()) {
            for (int k = 0; k < numRows && j < s.length(); k++) {
                rows[k].append(s.charAt(j++));
            }

            for (int k = numRows - 2; k > 0 && j < s.length(); k--) {
                rows[k].append(s.charAt(j++));
            }
        }

        for (int i = 1; i < rows.length; i++) {
            rows[0].append(rows[i].toString());
        }
        return rows[0].toString();
    }
}