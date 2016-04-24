public class Solution {
    public int calculate(String s) {
        if (s == null) return 0;
        int sum = 0;
        int previousValue = 0;
        char previousSign = '+';
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                number = number * 10 + (c - '0');
            }
            if (c == '+' || c == '-' || c == '*' || c == '/' || i == s.length() - 1) {
                if (previousSign == '+') {
                    sum = sum + previousValue;
                    previousValue = number;
                }
                if (previousSign == '-') {
                    sum = sum + previousValue;
                    previousValue = -number;
                }
                if (previousSign == '*') {
                    previousValue = previousValue * number;
                }
                if (previousSign == '/') {
                    previousValue = previousValue / number;
                }
                previousSign = c;
                number = 0;
            }
        }

        sum = sum + previousValue;
        return sum;
    }
}