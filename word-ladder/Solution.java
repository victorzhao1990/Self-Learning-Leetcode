// Single queue achieve BFS
public class Solution {
    public int ladderLength(String start, String end, Set<String> dict) {
      if ((start == null) || (end == null) || (start.length() == 0) || (end.length() == 0)) {
        return 0;
      }
      int level = 1;
      int lastLevel = 1;
      int currLevel = 0;
      HashSet<String> visited = new HashSet<String>();
      LinkedList<String> queue = new LinkedList<String>();
      queue.offer(start);
      visited.add(start);
      while(!queue.isEmpty()) {
        String curr = queue.poll();
        lastLevel--;
        for (int i = 0; i < curr.length(); i++) {
          char[] charray = curr.toCharArray();
          for (char c = 'a'; c <= 'z'; c++) {
            charray[i] = c;
            String tmp = new String(charray);
            if (tmp.equals(end)) {
              return level + 1;
            }
            if (!visited.contains(tmp) && dict.contains(tmp)) {
              currLevel++;
              queue.offer(tmp);
              visited.add(tmp);
            }
          }
        }
        if (lastLevel == 0) {
          lastLevel = currLevel;
          currLevel = 0;
          level++;
        }
      }
      return 0;
    }
}
