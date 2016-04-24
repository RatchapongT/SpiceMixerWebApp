public class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while ((slow = squareSum(slow)) != (fast = squareSum(squareSum(fast))));
        return slow == 1;
    }

    public int squareSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }
}