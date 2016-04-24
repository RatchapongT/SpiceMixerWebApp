public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Object, Object> map = new HashMap<>();
        for (Integer i = 0; i < s.length(); ++i) {
            if (map.put(s.charAt(i), i) != map.put(t.charAt(i) + "", i)) {
                return false;
            }
        }
        return true;
    }
}