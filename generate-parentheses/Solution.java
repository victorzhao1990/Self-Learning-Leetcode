// http://blog.csdn.net/yutianzuijin/article/details/13161721

import java.util.ArrayList;

public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
      ArrayList<String> res = new ArrayList<String>();
      String s = new String();
      generate(n, n, s, res);
      return res;
    }

    private void generate(int leftNum, int rightNum, String s, ArrayList<String> res) {
      if ((leftNum == rightNum) && (leftNum == 0)) {
        res.add(s.toString());
      }

      if (leftNum > 0) {
        generate(leftNum - 1, rightNum, s + "(", res);
      }

      if ((rightNum > 0) && (leftNum < rightNum)) {
        generate(leftNum, rightNum - 1, s + ")", res);
      }
    }

    public static void main(String[] args) {
      System.out.println((new Solution()).generateParenthesis(2));
    }
}
