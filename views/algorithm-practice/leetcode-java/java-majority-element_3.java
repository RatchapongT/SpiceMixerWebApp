public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (!map.containsKey(n)) {
                map.put(n, 0);
            }

            if (map.put(n, map.get(n) + 1) == nums.length / 2) {
                return n;
            }
        }
        return -1;
    }
}