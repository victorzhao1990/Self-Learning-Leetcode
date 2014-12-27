// http://blog.csdn.net/linhuanmars/article/details/21145039

public class Solution {
    public String convert(String s, int nRows) {
      if ((s == null) || (nRows == 0)) {
        return "";
      }

      if (nRows == 1) {
        return s;
      }

      int inter = 2 * nRows - 2;

      StringBuilder res = new StringBuilder();

      for (int i = 0; i < nRows; i++) {
        // res += s.charAt(i);
        for (int j = i; j < s.length(); j += inter) {
          res.append(s.charAt(j));
          if ((i != 0) && (i != nRows - 1) && ((j + inter - 2 * i) < s.length())) {
            res.append(s.charAt(j + inter - 2 * i));
          }
          // System.out.println(res.toString());
        }
        // System.out.println(res.toString());
        // System.out.println("*********");
      }
      return res.toString();
    }

    public static void main(String[] args) {
      System.out.println((new Solution()).convert("PAYPALISHIRING", 3));
    }
}
