public class Solution {
    public boolean isPowerOfFour(int n) {
        //maxPowerOfFour = 1073741824
        int maxPowerOfFour = (int) Math.pow(4, (int) (Math.log(Integer.MAX_VALUE) / Math.log(4)));
        return n > 0 && maxPowerOfFour % n == 0 && ((n & 0x55555555) != 0);
    }
}