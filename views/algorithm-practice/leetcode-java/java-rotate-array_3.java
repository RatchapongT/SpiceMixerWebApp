public class Solution {
    public void rotate(int[] nums, int k) {
        int numberOfRotates = k % nums.length;
        int[] rotatedElements = new int[numberOfRotates];
        for (int i = 0; i < numberOfRotates; i++) {
            rotatedElements[i] = nums[nums.length - numberOfRotates + i];
        }
        for (int i = nums.length - numberOfRotates - 1; i >= 0; i--) {
            nums[i + numberOfRotates] = nums[i];
        }
        for (int i = 0; i < numberOfRotates; i++) {
            nums[i] = rotatedElements[i];
        }
    }
}