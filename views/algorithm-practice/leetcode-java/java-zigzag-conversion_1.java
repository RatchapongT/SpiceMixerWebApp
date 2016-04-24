public class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        boolean down = true;
        int j = 0;
        for(int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }
        for(int i = 0; i < s.length(); i++) {
            rows[j].append(s.charAt(i));
            j = down ? j + 1 : j - 1;
            if (j  == numRows) {
                down = false;
                j = numRows - 2;
            } else if (j == -1) {
                down = true;
                j = 1;
            }

        }

        for(int i = 1; i < rows.length; i++) {
            rows[0].append(rows[i].toString());
        }
        return rows[0].toString();
    }
}