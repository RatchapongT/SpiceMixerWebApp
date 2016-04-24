public class Solution {
    public int calculate(String s) {
        if (s == null) return 0;
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        int sign = 1;
        int number = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                number = number * 10 + (c - '0');
            }
            if (c == '-' || c == '+' || i == s.length() - 1) {
                result = result + number * sign;
                number = 0;
                sign = (c == '+') ? 1 : -1;
            }
            if (c == '(') {
                stack.push(result);
                stack.push(sign);
                sign = 1;
                number = 0;
                result = 0;
            }
            if (c == ')') {
                result = result + number * sign;
                result = result * stack.pop() + stack.pop();
                number = 0;
            }
        }
        return result;
    }
}