public class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int[] res = new int[2];
      Arrays.sort(numbers);
      if ((numbers == null) || (numbers.length == 0)) {
        return null;
      }
      int i = 0;
      int j = numbers.length - 1;
      while (i < j) {
        if (target > (numbers[i] + numbers[j])) {
          i++;
          System.out.println("*******");
        }
        if (target < (numbers[i] + numbers[j])) {
          j--;
        }
        if (target == (numbers[i] + numbers[j])) {
          res[0] = i;
          res[1] = j;
          return res;

        }
      }
      return null;
    }

    public static void main(String[] args) {
      int[] numbers = {3, 2, 4};
      int[] n = (new Solution()).twoSum(numbers, 6);
      for (int i : n) {
        System.out.println(i);
      }
    }
}
