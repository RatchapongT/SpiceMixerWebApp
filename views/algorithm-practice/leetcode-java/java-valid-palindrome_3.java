public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (isAlphanumeric(s.charAt(left)) && isAlphanumeric(s.charAt(right))) {
                if (s.charAt(left++) != s.charAt(right--)) {
                    return false;
                }
            } else {
                if (!isAlphanumeric(s.charAt(left))) left++;
                if (!isAlphanumeric(s.charAt(right))) right--;
            }
        }
        return true;
    }

    public boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}