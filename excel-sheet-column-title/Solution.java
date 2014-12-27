public class Solution {
    public String convertToTitle(int n) {
      if (n <= 0) {
        return "";
      }
      StringBuilder str = new StringBuilder();
      int rem = -1;
      while ((n / 26) > 0) {
        rem = n % 26;
        n = n / 26;
        if (rem != 0) {
          str.append((char)(rem + 64));
        } else {
          str.append('Z');
          rem = -1;
        }
      }
      if (rem != 0) {
        str.append((char)(n + 64));
      }
      str = str.reverse();
      return str.toString();
    }

    public static void main(String[] args) {
      System.out.println((new Solution().convertToTitle(26)));
    }
}
