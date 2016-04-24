public class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) return 0;
        int i = 0;
        int sign = 1;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        if (i < str.length()) {
            if (str.charAt(i) == '+') {
                sign = 1;
                i++;
            } else if (str.charAt(i) == '-') {
                sign = -1;
                i++;
            }
        }
        int result = 0;
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            result = result * 10 + (str.charAt(i++) - '0');
        }
        return result * sign;

    }
}