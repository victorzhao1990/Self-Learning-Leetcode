// http://blog.sina.com.cn/s/blog_b9285de20101jbtl.html
public class Solution {
  ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();

  public ArrayList<ArrayList<String>> partition(String s) {
    ArrayList<String> al = new ArrayList<String>();
    dfs(s, 0, al);
    return res;
  }

  private boolean isPalin(String s, int i, int j) {
    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  private void dfs(String s, int start, ArrayList<String> al) {
    if (start == s.length()) {
      res.add(new ArrayList<String>(al));
      return;
    }
    for (int i = start + 1; i <= s.length(); i++) {
      if (isPalin(s, start, i - 1)) {
        al.add(s.substring(start, i));
        dfs(s, i, al);
        al.remove(al.size() - 1);
      }
    }
  }
}
