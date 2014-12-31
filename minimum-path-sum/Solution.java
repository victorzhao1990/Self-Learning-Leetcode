// http://blog.csdn.net/u010500263/article/details/18218561
import java.lang.Math;

public class Solution {
  public int minPathSum(int[][] grid) {
    if (grid[0].length == 0) {
      return 0;
    }
    int row = grid.length;
    int col = grid[0].length;

    int[][] sum = new int[row][col];
    sum[0][0] = grid[0][0];

    for (int i = 1; i < row; i++) {
      sum[i][0] = sum[i - 1][0] + grid[i][0];
    }

    for (int i = 1; i < col; i++) {
      sum[0][i] = sum[0][i - 1] + grid[0][i];
    }

    for (int i = 1; i < row; i++) {
      for (int j = 1; j < col; j++) {
        sum[i][j] = Math.min(sum[i - 1][j], sum[i][j - 1]) + grid[i][j];
      }
    }
    return sum[row - 1][col - 1];
  }

    public static void main(String[] args) {
      int[][] grid = new int[][]{
        {1}
      };
      System.out.println((new Solution()).minPathSum(grid));
    }
}
