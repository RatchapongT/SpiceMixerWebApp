public class Solution {
    public int[] plusOne(int[] digits) {
        int c = 1;
        int i = digits.length - 1;
        while (i >= 0 && c == 1) {
            c = c + digits[i];
            digits[i] = c % 10;
            c = c / 10;
            i--;
        }
        if (c == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        return digits;
    }
}