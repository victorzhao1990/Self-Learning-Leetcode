public class Solution {
  public int searchInsert(int[] A, int target) {
    if ((A == null) || (A.length == 0)) {
      return 0;
    }

    int l = 0;
    int r = A.length - 1;
    int mid = 0;
    while (l <= r) {
      mid = l + (r - l) / 2;
      if (A[mid] == target) {
        break;
      }

      if (A[mid] < target) {
        l = mid + 1;
      }

      if (A[mid] > target) {
        r = mid - 1;
      }
    }

    if (A[mid] < target) {
      return mid + 1;
    } else {
      return mid;
    }
  }
}
