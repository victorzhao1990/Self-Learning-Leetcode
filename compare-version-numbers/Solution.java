public class Solution {
    public int compareVersion(String version1, String version2) {
      int index1 = 0;
      int index2 = 0;
      while (index1 < version1.length() || index2 < version2.length()) {
        int currSum1 = 0;
        int currSum2 = 0;
        while (index1 < version1.length() && version1.charAt(index1) != '.') {
          currSum1 = currSum1 * 10 + version1.charAt(index1) - '0';
          System.out.println(version1.charAt(index1));
          System.out.println("currSum1" + currSum1);
          index1++;
        }
        index1++;
        while (index2 < version2.length() && version2.charAt(index2) != '.') {
          currSum2 += currSum2 * 10 + version2.charAt(index2) - '0';
          System.out.println(version2.charAt(index2));
          System.out.println("currSum2" + currSum2);
          index2++;
        }
        index2++;
        if (currSum1 > currSum2) {
          return 1;
        }

        if (currSum1 < currSum2) {
          return -1;
        }

        System.out.println("Level sums are" + currSum1 + "," + currSum2);
      }

      return 0;
    }

    public static void main(String[] args) {
      System.out.println((new Solution()).compareVersion("10", "10"));
    }
}
