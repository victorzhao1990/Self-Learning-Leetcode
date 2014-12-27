public class Solution {
    public boolean isPalindrome(int x) {
        int bit = 0;
        while (x / 10 != 0) {
            bit++;
            x /= 10;
        }
        System.out.println(bit);
        return true;
    }

    public static void main(String [] args) {
        Solution sol = new Solution();
        sol.isPalindrome(12345);
    }
}
