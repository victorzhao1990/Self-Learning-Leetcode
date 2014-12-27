// http://www.geeksforgeeks.org/majority-element/
public class Solution {
    public int majorityElement(int[] num) {
      int maj = findCandidate(num);
      if (isMajor(num, maj)) {
        return maj;
      } else {
        return -1;
      }
    }

    private int findCandidate(int[] num) {
      int maj_index = 0, count = 1;
      for (int i = 1; i < num.length; i++) {
        if (num[maj_index] == num[i]) {
          count++;
        } else {
          count--;
        }
        if (count == 0) {
          maj_index = i;
          count = 1;
        }
      }
      return num[maj_index];
    }

    private boolean isMajor(int[] num, int maj) {
      int count = 0;
      for (int i = 0; i < num.length; i++) {
        if (num[i] == maj) {
          count++;
        }
      }
      return count > (num.length / 2);
    }

    public static void main (String[] args) {
      int[] num = {1,1,1,1,1,1,1,4,5,6,7};
      System.out.println("Mj is" + new Solution().majorityElement(num));
    }
}
