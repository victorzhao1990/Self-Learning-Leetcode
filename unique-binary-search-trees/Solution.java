public class Solution {
    public int numTrees(int n) {
      if (n <= 0) {
        return 0;
      }
      int[] res = new int[n + 1];
      res[0] = 1;
      res[1] = 1;
      for (int i = 2; i <= n; i++) {
        for (int j = 0; j < i; j++) {
          res[i] += res[i - j - 1] * res[j];
        }
      }
      return res[n];
    }

    public static void main(String[] args) {
      System.out.println((new Solution()).numTrees(Integer.parseInt(args[0])));
    }
}
