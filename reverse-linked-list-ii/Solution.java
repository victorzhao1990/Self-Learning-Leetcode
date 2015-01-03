// http://blog.csdn.net/linhuanmars/article/details/24613781
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
      if (head == null) {
        return null;
      }
      ListNode dummy = new ListNode(0);

      dummy.next = head;
      ListNode preNode = dummy;
      int i = 1;
      while ((preNode != null) && (i < m)) {
        preNode = preNode.next;
        i++;
      }
      if (preNode == null) {
        return head;
      }

      ListNode mNode = preNode.next;
      ListNode currNode = mNode.next;

      while (currNode != null && i < n) {
        ListNode next = currNode.next;
        currNode.next = preNode.next;
        preNode.next = currNode;
        mNode.next = next;
        currNode = next;
        i++;
      }

      return dummy.next;
    }
}
