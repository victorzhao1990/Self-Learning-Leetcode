import java.util.ArrayList;

public class Solution {
    String[] map = {"", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    ArrayList<String> res = new ArrayList<String>();
    public ArrayList<String> letterCombinations(String digits) {
      String r = "";
      dfs(digits, 0, r);
      return res;
    }

    private void dfs(String digits, int start, String r) {
      if (start == digits.length()) {
        res.add(r);
        System.out.println(r);
        return;
      }

      int currDig = (int)(digits.charAt(start) - '0');

      for (int i = 0; i < map[currDig].length(); i++) {
        r = r + map[currDig].charAt(i);
        dfs(digits, start + 1, r);
        r = r.substring(0, r.length() - 1);
        System.out.println("sub " + r);
      }
    }

    public static void main(String[] args) {
      System.out.println((new Solution()).letterCombinations("23"));
    }
}
