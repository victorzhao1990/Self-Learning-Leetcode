import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
      int i = 0;
      int j = 0;
      HashSet<Character> hs = new HashSet<Character>();
      int max = 0;

      if (s.length() == 0) {
        return 0;
      }
      while (j < s.length()) {
        if (hs.contains(s.charAt(j))) {
          if (j - i > max) {
            System.out.println(i + "," + s.charAt(i));
            System.out.println(j + "," + s.charAt(j));
            max = j - i;
          }
          while (s.charAt(j) != s.charAt(i)) {
            hs.remove(s.charAt(i));
            i++;
          }
          i++;
        } else {
          hs.add(s.charAt(j));
        }
        j++;

        System.out.println("max is" + max);
      }
      if (j - i > max) {
        max = j - i;
      }
      // System.out.println(i + "," + j);
      return max;
    }

    public static void main(String[] args) {
      System.out.println("long is" + (new Solution()).lengthOfLongestSubstring("abcc"));
    }
}
