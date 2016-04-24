public class Solution {
    public int palindromeEditDistance(String s) {
        int[][] dp = new int[s.length()][s.length()];
        char[] charArray = s.toCharArray();
        for (int gap = 1; gap < s.length(); gap++) {
            int l = 0;
            for (int r = gap; r < s.length(); r++) {
                if (charArray[l] == charArray[r]) {
                    dp[l][r] = dp[l + 1][r - 1];
                } else {
                    int left = dp[l + 1][r];
                    int right = dp[l][r - 1];
                    int middle = dp[l + 1][r - 1];
                    dp[l][r] = Math.min(Math.min(left, right), middle) + 1;
                }
                l++;
            }
        }
        return dp[0][charArray.length - 1];
    }
}