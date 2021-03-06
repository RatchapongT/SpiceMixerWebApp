public class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int c = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || c == 1) {
            c += i >= 0 ? (a.charAt(i--) - '0') : 0;
            c += j >= 0 ? (b.charAt(j--) - '0') : 0;
            sb = sb.insert(0, c % 2);
            c = c / 2;
        }
        return sb.toString();
    }
}