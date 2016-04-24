public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0] == null || strs[0].length() == 0) return "";

        boolean foundLongest = false;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (!foundLongest && i < strs[0].length()) {
            char currentChar = strs[0].charAt(i);
            for (String word : strs) {
                if (word == null || i >= word.length() || word.charAt(i) != currentChar) {
                    foundLongest = true;
                }
            }
            if (!foundLongest) {
                i++;
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
}