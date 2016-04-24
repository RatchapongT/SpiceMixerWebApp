public class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length() - 1;

        while (i >= 0 && !valid(s.charAt(i))) {
            i--;
        }
        while (i >= 0 && valid(s.charAt(i))) {
            i--;
            count++;
        }

        return count;
    }

    public boolean valid(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }
}