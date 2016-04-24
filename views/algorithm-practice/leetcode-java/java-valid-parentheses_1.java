public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                c = c == ')' ? '(' : c == '}' ? '{' : '[';
                if (stack.empty() || stack.pop() != c) return false;
            }
        }
        return stack.empty();
    }
}