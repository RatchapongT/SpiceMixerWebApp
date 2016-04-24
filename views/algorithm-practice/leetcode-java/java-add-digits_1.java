public class Solution {
    public int addDigits(int num) {
        while (num / 10 > 0) {
            int sum = 0;
            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
}