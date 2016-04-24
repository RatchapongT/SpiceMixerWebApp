public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int insertIndex = 0;
        for (int n : nums) {
            if (n != 0) {
                nums[insertIndex++] = n;
            }
        }

        while (insertIndex < nums.length) {
            nums[insertIndex++] = 0;
        }
    }
}