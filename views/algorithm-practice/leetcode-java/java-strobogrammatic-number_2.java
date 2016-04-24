public class Solution {
    public boolean isStrobogrammatic(String num) {
        int i = 0;
        int j = num.length() - 1;
        while (i <= j) {
            if (!"00 11 88 696".contains(num.charAt(i++) + "" + num.charAt(j--))) {
                return false;
            }
        }
        return true;
    }
}