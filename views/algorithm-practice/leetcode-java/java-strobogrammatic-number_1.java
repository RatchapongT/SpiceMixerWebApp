public class Solution {
    public boolean isStrobogrammatic(String num) {
        char[] map = new char[256];
        map['8'] = '8';
        map['6'] = '9';
        map['9'] = '6';
        map['0'] = '0';
        map['1'] = '1';
        int left = 0;
        int right = num.length() - 1;
        while (left <= right) {
            if (num.charAt(left++) != map[num.charAt(right--)]) {
                return false;
            }
        }
        return true;
    }
}