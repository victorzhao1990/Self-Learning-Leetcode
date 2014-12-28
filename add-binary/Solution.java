public class Solution {
  public String addBinary(String a, String b) {
    if ((a.length() == 0) || (a == null)) {
      return b;
    }

    if ((b.length() == 0) || (b == null)) {
      return a;
    }

    int ind_a = a.length() - 1;
    int ind_b = b.length() - 1;

    int carry = 0;

    StringBuilder sb = new StringBuilder();

    while ((ind_a >= 0) && (ind_b >= 0)) {
      int digit = (int)(a.charAt(ind_a) - '0' + b.charAt(ind_b) - '0') + carry;
      carry = digit / 2;
      System.out.println("carr is" + carry);
      digit = digit % 2;
      sb.append(digit);
      ind_a--;
      ind_b--;
    }

    while (ind_a >= 0) {
      int digit = (int)(a.charAt(ind_a) - '0') + carry;
      carry = digit / 2;
      digit = digit % 2;
      sb.append(digit);
      ind_a--;
    }

    while (ind_b >= 0) {
      int digit = (int)(b.charAt(ind_b) - '0') + carry;
      carry = digit / 2;
      digit = digit % 2;
      sb.append(digit);
      ind_b--;
    }

    if (carry == 1) {
      sb.append(1);
      System.out.println("*********");
    }

    return sb.reverse().toString();
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.addBinary(args[0], args[1]));
  }
}
