public class Solution {
  public int threeSumClosest(int[] num, int target) {
    int res = 0;
    int min = Integer.MAX_VALUE;
    Arrays.sort(num);
    for (int i = 0; i < num.length - 2; i++) {
      int h = i + 1;
      int t = num.length - 1;
      while (h < t) {
        int sum = num[i] + num[h] + num[t];
        int diff = Math.abs(sum - target);
        if (diff < min) {
          //System.out.println("min is" + min + "diff is" + diff);
          min = diff;
          res = sum;
          //System.out.println("First Number is" + i + "Second is" + h + "Third is" + t);
        }
        if (sum > target) {
          t--;
        }
        if (sum < target) {
          h++;
        }
        if (sum == target) {
          return target;
        }
      }
    }
    return res;
  }
    public static void main(String[] args) {
      int[] num = {1, 1, 1, 0};
      System.out.println((new Solution()).threeSumClosest(num, 100));
    }
}
