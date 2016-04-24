public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] r = new boolean[9][9];
        boolean[][] c = new boolean[9][9];
        boolean[][] b = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                int digit = board[i][j] - '1';
                if (r[i][digit] || c[j][digit] || b[3 * (i / 3) + j / 3][digit]) {
                    return false;
                }
                r[i][digit] = true;
                c[j][digit] = true;
                b[3 * (i / 3) + j / 3][digit] = true;
            }
        }
        return true;
    }
}