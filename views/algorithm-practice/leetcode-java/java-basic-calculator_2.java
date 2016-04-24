public class Solution {
    int parenthesesIndex = 0;

    public int calculate(String s) {
        if (s == null) return 0;
        s = "(" + s + ")";
        return evaluate(s);
    }

    private int evaluate(String s) {
        int i = parenthesesIndex;
        int sign = 1;
        int number = 0;
        int result = 0;

        while (i < s.length()) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                number = number * 10 + (c - '0');
                i++;
            } else if (c == '-' || c == '+') {
                result = result + number * sign;
                number = 0;
                sign = (c == '+') ? 1 : -1;
                i++;
            } else if (c == '(') {
                parenthesesIndex = i + 1;
                result = result + sign * evaluate(s);
                i = parenthesesIndex;
            } else if (c == ')') {
                parenthesesIndex = i + 1;
                return result + sign * number;
            } else {
                i++;
            }
        }
        return result;
    }
}