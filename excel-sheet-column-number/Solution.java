public class Solution {
    public int titleToNumber(String s) {
        int len = s.length();
        int result = 0;
        for (int i = len - 1; i >= 0; i--) {
            result += (int)(s.charAt(i) - 64) * Math.pow(26, (double)(len - i - 1));
        }
        return result;
    }
}
