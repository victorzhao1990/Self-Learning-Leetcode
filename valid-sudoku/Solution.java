public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> test = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !test.add(board[i][j])) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            HashSet<Character> test = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.' && !test.add(board[j][i])) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                HashSet<Character> test = new HashSet<Character>();
                for (int m = i * 3; m < i * 3 + 3; m++) {

                    for (int n = j * 3; n < j * 3 + 3; n++) {
                        if (board[m][n] != '.' && !test.add(board[m][n])) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
