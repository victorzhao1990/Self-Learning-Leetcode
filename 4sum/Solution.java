import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
      ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
      HashSet<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();
      if ((num == null) || (num.length == 0)) {
        return res;
      }
      Arrays.sort(num);
      for (int i = 0; i < num.length - 3; i++) {
        if ((i == 0) || (num[i - 1] < num[i])) {
          for (int j = i + 1; j < num.length - 2; j++) {
            if ((j == i + 1) || (num[j - 1] < num[j])) {
              int h = j + 1;
              int t = num.length - 1;
              while (h < t) {
                int sum = num[i] + num[j] + num[h] + num[t];
                if (sum > target) {
                  t--;
                }
                if (sum < target) {
                  h++;
                }
                if (sum == target) {
                  ArrayList<Integer> r = new ArrayList<Integer>();
                  r.add(num[i]);
                  r.add(num[j]);
                  r.add(num[h]);
                  r.add(num[t]);
                  if (hs.add(r)) {
                    res.add(r);
                  }
                  h++;
                  t--;
                  while ((h < t) && (num[h - 1] == num[h])) {
                    h++;
                  }
                  while ((h < t) && (num[t] == num[t + 1])) {
                    t--;
                  }
                }
              }
            }
          }
        }
      }
      return res;
    }
    public static void main(String[] args) {
      int[] num = {1, 0, -1, 0, -2, 2};
      System.out.println((new Solution()).fourSum(num, 0));
    }
}
