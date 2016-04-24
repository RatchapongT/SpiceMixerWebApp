public class Solution {
    public boolean isPalindrome(String s) {
        int[] map = new int[256];
        for (int i = 0; i < 26; i++) {
            map[i + 'a'] = i + 'a';
            map[i + 'A'] = i + 'a';
            if (i < 10) {
                map[i + '0'] = i + '0';
            }

        }

        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        int charLeft;
        int charRight;
        while (left < right) {
            charLeft = map[charArray[left]];
            charRight = map[charArray[right]];
            if (charLeft != 0 && charRight != 0) {
                if (charLeft != charRight) return false;
                left++;
                right--;
            } else {
                if (charLeft == 0) left++;
                if (charRight == 0) right--;
            }
        }
        return true;
    }
}