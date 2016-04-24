public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] charArray = s.toCharArray();
        int sum = map.get(charArray[charArray.length - 1]);
        for (int i = charArray.length - 2; i >= 0; i--) {
            int current = map.get(charArray[i]);
            int after = map.get(charArray[i + 1]);
            if (after <= current) {
                sum = sum + current;
            } else {
                sum = sum - current;
            }
        }
        return sum;
    }


}