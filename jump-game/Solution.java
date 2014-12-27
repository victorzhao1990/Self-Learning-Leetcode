import java.lang.Math;

public class Solution {
    public boolean canJump(int[] A) {
        int size = A.length;
        int [] hop_remain = new int[size]; // define hop_remain as the remaining step after jumping from 0 to current index
        hop_remain[0] = 0; // base case hop_remain[0] = 0
        for (int i = 1; i < size; i++) {
            hop_remain[i] = Math.max(hop_remain[i - 1], A[i - 1]) - 1;
            if (hop_remain[i] < 0) { 
                // System.out.println(hop_remain.toString());
                for (int hi : hop_remain) {
                    System.out.print(hi + ",");
                }
                System.out.println();
                return false;
            }
        }
        // System.out.println(hop_remain);
        for (int hi : hop_remain) {
            System.out.println(hi + ",");
        }
        System.out.println();
        return true;
    }

    public static void main(String [] args) {
        Solution sol = new Solution();
        int [] A = {3, 2, 1, 1 ,4};
        sol.canJump(A);
    }
}
