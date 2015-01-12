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
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode curr = head;

        while (curr != null) {
          while ((curr.next != null) && (curr.next.val == pre.next.val)) {
            curr = curr.next;
          }
          if (pre.next == curr) { // If no duplicates found
            pre = curr; // Just add current into candidate list
          } else { // else skip all the duplicate value 
            pre.next = curr.next;
          }
          curr = curr.next;
        }
        return dummy.next;
    }
}
