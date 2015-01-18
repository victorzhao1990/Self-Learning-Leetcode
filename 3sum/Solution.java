import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
  public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    if ((num == null) || (num.length == 0)) {
      return res;
    }

    Arrays.sort(num);
    // The point can only reach to the 3rd from the end
    for (int i = 0; i < num.length - 2; i++) {
      int h = i + 1;
      int t = num.length - 1;
      if ((i == 0) || (num[i] > num[i - 1])) {
        while (h < t) {
          int sum = num[i] + num[h] + num[t];
          if (sum < 0) {
            h++;
          }
          if (sum > 0) {
            t--;
          }
          if (sum == 0) {
            ArrayList<Integer> r = new ArrayList<Integer>();
            r.add(num[i]);
            r.add(num[h]);
            r.add(num[t]);
            //System.out.println(r + "," + i + "," + h + "," + t);
            h++;
            t--;
            while ((h < t) && (num[h] == num[h - 1])) {
              h++;
            }
            while ((h < t) && (num[t] == num[t + 1])) {
              t--;
            }
            res.add(new ArrayList<Integer>(r));

          }
        }
      }
    }
    return res;
  }

    public static void main(String[] args) {
      int[] num = {-1, 0, 1, 2, -1, -4};
      System.out.println((new Solution()).threeSum(num));
    }
}
