public class Solution {
    public String reverseString(String s) {
        byte[] bytes = s.getBytes();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            bytes[i] = (byte) (bytes[i] ^ bytes[j]);
            bytes[j] = (byte) (bytes[i] ^ bytes[j]);
            bytes[i] = (byte) (bytes[i] ^ bytes[j]);
            i++;
            j--;
        }
        return new String(bytes);
    }
}