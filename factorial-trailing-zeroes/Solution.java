public class Solution {
    public int trailingZeroes(int n) {
        long fac = 5;
        int res = 0;
        while (n >= fac) {
            res += n / fac;
            fac *= 5;
            System.out.println(fac);
        }
        return res;
    }

    public static void main(String[] args) {
      System.out.println((new Solution()).trailingZeroes(2147483647));
    }
}
