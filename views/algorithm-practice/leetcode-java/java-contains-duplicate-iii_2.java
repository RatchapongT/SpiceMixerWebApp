public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        for (int n : nums) {
            if (i > k) set.remove(nums[i - k - 1]);
            if (!set.add(n)) return true;
            i++;
        }
        return false;
    }
}