/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

class ListNode {
  int val;
  ListNode next;
  ListNode(int x) {
    val = x;
    next = null;
  }
}

public class Solution {
    public ListNode swapPairs(ListNode head) {
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      head = dummy;
      while ((dummy.next != null) && (dummy.next.next != null)) {
        ListNode tmp = dummy.next.next.next;
        dummy.next.next.next = dummy.next;
        dummy.next = dummy.next.next;
        dummy.next.next.next = tmp;
        dummy = dummy.next.next;
      }
      return head.next;
    }

    public static void main(String[] args) {
      ListNode head = new ListNode(1);
      head.next = new ListNode(2);
      head.next.next = new ListNode(3);
      head.next.next.next = new ListNode(4);
      head = new Solution().swapPairs(head);
      int i = 0;
      while (head != null) {
        System.out.print("Node" + i + head.val);
        head = head.next;
      }
    }
}
