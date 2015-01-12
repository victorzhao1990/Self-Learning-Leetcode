public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      if ((candidates == null) || (candidates.length == 0) || (target == 0)) {
        return null;
      }
      Arrays.sort(candidates);

      ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

      dfs(candidates, 0, target, new ArrayList<Integer>(), res);

      return res;
    }

    private void dfs(int[] candidates, int start, int target, ArrayList<Integer> item, ArrayList<ArrayList<Integer>> res) {
      if (target < 0) {
        return;
      }

      if (target == 0) {
        item.add(candidates[start]);
        return;
      }

      for (int i = start; i < candidates.length; i++) {
        if ((i > 0) && (candidates[i - 1] == candidates[i])) {
          continue;
        }
        item.add(candidates[i]);
        dfs(candidates, i, target - candidates[i], item, res);
        item.remove(item.size() - 1);
      }
    }
}
