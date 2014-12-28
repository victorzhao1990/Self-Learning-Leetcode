//http://blog.csdn.net/linhuanmars/article/details/21858067
public class Solution {
    public int lengthOfLastWord(String s) {
      if ((s == null) || (s.length() == 0)) {
        return 0;
      }
      int ind = s.length() - 1;
      while ((ind >= 0) && (s.charAt(ind) == ' ')) {
        ind--;
      }
      int ind2 = ind;
      while ((ind2 >= 0) && (s.charAt(ind2) != ' ')) {
        ind2--;
      }
      return ind - ind2;
    }

    public static void main(String[] args) {
        System.out.println((new Solution()).lengthOfLastWord(" "));
        String a = " ";
        System.out.println(a.length());
    }
}
