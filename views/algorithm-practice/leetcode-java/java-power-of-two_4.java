public class Solution {
    public boolean isPowerOfTwo(int n) {
        //maxPowerOfTwo = 1073741824
        int maxPowerOfTwo = (int) Math.pow(2, (int) (Math.log(Integer.MAX_VALUE) / Math.log(2)));
        return n > 0 && maxPowerOfTwo % n == 0;
    }

}