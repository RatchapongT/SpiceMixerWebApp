public class Solution {
    public int calculate(String s) {
        if (s == null) return 0;
        Stack<Integer> stack = new Stack<>();
        char previousSign = '+';
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                number = number * 10 + (c - '0');
            }
            if (c == '+' || c == '-' || c == '*' || c == '/' || i == s.length() - 1) {
                if (previousSign == '+') {
                    stack.push(number);
                }
                if (previousSign == '-') {
                    stack.push(number * -1);
                }
                if (previousSign == '*') {
                    stack.push(stack.pop() * number);
                }
                if (previousSign == '/') {
                    stack.push(stack.pop() / number);
                }
                previousSign = c;
                number = 0;
            }
        }

        int sum = 0;
        while (!stack.empty()) {
            sum = sum + stack.pop();
        }
        return sum;
    }
}