public class Solution {
  public int search(int[] A, int target) {
    if ((A == null) || (A.length == 0)) {
      return 0;
    }

    int l = 0;
    int r = A.length - 1;

    while (l <= r) {
      int mid = l + (r - l) / 2;
      if (A[mid] == target) {
        return mid;
      }
      if (A[mid] <= A[r]) {
        if ((A[mid] <= target) && (target <= A[r])) {
          l = mid + 1;
        } else {
          r = mid - 1;
        }
      }

      if (A[l] <= A[mid]) {
        if ((A[mid] >= target) && (A[l] <= target)) {
          r = mid - 1;
        } else {
          l = mid + 1;
        }
      }
    }

    return -1;
  }
}
