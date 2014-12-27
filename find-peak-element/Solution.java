//Find Peak Element
//
// A peak element is an element that is greater than its neighbors.
//
// Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
//
// The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
//
// You may imagine that num[-1] = num[n] = -∞.
//
// For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
//
// click to show spoilers.
// http://www.geeksforgeeks.org/find-a-peak-in-a-given-array/
// Credits:
// Special thanks to @ts for adding this problem and creating all test cases.
import java.lang.Integer;

public class Solution {
  public int findPeakElement(int[] num) {
    return findPeakUtil(num, 0, num.length - 1);
  }
  private int findPeakUtil(int[] arr, int low, int high) {
    int mid = low + (high - low) / 2;

    if ((mid == 0 || (arr[mid - 1] <= arr[mid])) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
      return mid;
    }  else if (arr[mid] < arr[mid + 1]) {
      return findPeakUtil(arr, mid + 1, high);
    } else {
      return findPeakUtil(arr, low, mid - 1);
    }
  }

  public int findPeakEleNonRecurr(int[] num) {
    int mid = num.length / 2;
    int lNeigh, rNeigh;
    int low = 0;
    int high = num.length - 1;
    for (int i = 0; i < num.length / 2; i++) {
      if (mid == 0) {
        lNeigh = Integer.MIN_VALUE;
      } else {
        lNeigh = num[mid - 1];
      }

      if (mid == (num.length - 1)) {
        rNeigh = Integer.MIN_VALUE;
      } else {
        rNeigh = num[mid + 1];
      }

      if ((num[mid] > rNeigh) && (num[mid] > lNeigh)) {
        return mid;
      } else if (num[mid] < rNeigh) {
        low = mid + 1;
      } else if (num[mid] < lNeigh) {
        high = mid - 1;
      }
      mid = low + (high - low) / 2;
      //System.out.println("high is" + high);
      System.out.println("mid is" + mid);
    }
    return mid;
  }
  public static void main (String [] args) {
    int[] num = {1, 2, 3, 4, 5};
    System.out.println((new Solution()).findPeakElement(num));
    System.out.println((new Solution()).findPeakEleNonRecurr(num));
  }

}
