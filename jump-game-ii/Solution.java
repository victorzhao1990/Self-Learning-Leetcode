public class Solution {
    public int jump(int[] A) {
        int counter = 0;
        // int max_hop[]
        int [] max_hop = new int[A.length];
        int range; 
        if (A.length > 1){
            for (int i = 0; i < A.length;) {
                range = A[i] + i;
                for (int j = i; j < range; j++) {
                    if ((A[j] + j) == A.length - 1)
                        return counter;
                }
                counter++;
                i += range;
            }
        }
        else {
            return 0;
        }
    }
    public static void main(String [] args) {
        
    }
}
