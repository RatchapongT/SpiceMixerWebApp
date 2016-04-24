public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        char[] array = pattern.toCharArray();
        if (array.length != words.length) return false;
        Map<Object, Object> map = new HashMap<>();
        for (Integer i = 0; i < array.length; i++) {
            if (map.put(array[i], i) != map.put(words[i], i)) {
                return false;
            }
        }
        return true;
    }
}