public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] r = new int[9];
        int[] c = new int[9];
        int[] b = new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                int digit = 1 << (board[i][j] - '0');
                if ((r[i] & digit) > 0 || (c[j] & digit) > 0 || (b[(i / 3) * 3 + j / 3] & digit) > 0) {
                    return false;
                }
                r[i] = r[i] | digit;
                c[j] = c[j] | digit;
                b[(i / 3) * 3 + j / 3] = b[(i / 3) * 3 + j / 3] | digit;
            }
        }
        return true;
    }
}