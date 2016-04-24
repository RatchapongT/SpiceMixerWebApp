public class Solution {
    public boolean isPowerOfThree(int n) {
        //maxPowerOfThree = 1162261467
        int maxPowerOfThree = (int) Math.pow(3, (int) (Math.log(Integer.MAX_VALUE) / Math.log(3)));
        return n > 0 && maxPowerOfThree % n == 0;
    }
}