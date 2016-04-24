public class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        int n = nums.length;
        int[] sum = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n + 1; i++) {
            map.put(sum[i], i);
        }
        int max = 0;
        for (int i = 0; i < n + 1; i++) {
            Integer partialSum = map.get(sum[i] + k);
            if (partialSum != null) {
                max = Math.max(max, partialSum - i);
            }
        }
        return max;
    }
}