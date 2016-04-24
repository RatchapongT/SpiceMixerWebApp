public class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        StringBuilder result = new StringBuilder();
        //the size of a cycle(period)
        int cycle = 2 * numRows - 2;
        for (int i = 0; i < numRows; ++i) {
            for (int j = i; j < s.length(); j = j + cycle) {
                result.append(s.charAt(j));
                int next = (j - i) + cycle - i;
                if (i != 0 && i != numRows - 1 && next < s.length()) {
                    result.append(s.charAt(next));
                }
            }
        }
        return result.toString();
    }
}