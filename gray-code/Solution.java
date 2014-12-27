import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> grayCode(int n) {
      ArrayList<Integer> result = new ArrayList<Integer>();
      if (n <= 1) {
        for (int i = 0; i <= n; i++) {
          result.add(i);
        }
        return result;
      }
      result = grayCode(n - 1);
      ArrayList<Integer> rev = reverse(result);
      int ini = 1 << (n - 1);
      for (int i = 0; i < rev.size(); i++) {
        int newEle = rev.get(i) + ini;
        result.add(newEle);
      }
      return result;
    }

    private ArrayList<Integer> reverse(ArrayList<Integer> ori) {
      ArrayList<Integer> rev = new ArrayList<Integer>();
      for (int i = ori.size() - 1; i >= 0; i--) {
        rev.add(ori.get(i));
      }
      return rev;
    }

    public static void main(String[] args) {
      System.out.println((new Solution()).grayCode(3));
    }
}
