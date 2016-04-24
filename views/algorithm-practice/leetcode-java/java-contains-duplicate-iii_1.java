public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (int n : nums) {
            if (map.containsKey(n)) {
                if (i - map.get(n) <= k) {
                    return true;
                }
            }
            map.put(n, i++);
        }
        return false;
    }
}