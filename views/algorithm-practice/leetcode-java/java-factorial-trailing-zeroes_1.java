public class Solution {
    public int trailingZeroes(int n) {
        // 1 2 3 4 5 = 1

        // 6 7 8 9 10 = 1

        // 11 12 13 14 15 = 1

        // 16 17 18 19 20 = 1

        // 21 22 23 24 25 = 2

        // 26 27 28 29 30 = 1

        // 31 32 33 34 35 = 1

        // 36 37 38 39 40 = 1

        // 41 42 43 44 45 = 1

        // 46 47 48 49 50 = 2

        int blockOf5 = n / 5;
        int result = 0;
        int five = 1;
        while (blockOf5 /five > 0) {

            result = result + blockOf5 /five;
            five = five * 5;
        }

        return result;
    }
}