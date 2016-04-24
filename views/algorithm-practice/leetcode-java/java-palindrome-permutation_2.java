public class Solution {
    public boolean canPermutePalindrome(String s) {
        BitSet set = new BitSet();
        for (byte b : s.getBytes()) {
            set.flip(b);
        }
        return set.cardinality() <= 1;
    }
}