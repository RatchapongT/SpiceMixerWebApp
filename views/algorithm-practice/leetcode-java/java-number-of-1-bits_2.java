public class Solution {
    //n is an unsigned value
    public int hammingWeight(int n) {
        int bit = 0;
        while (n != 0) {
            bit = bit + (n & 1);
            n = n >>> 1;
        }
        return bit;
    }
}