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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      int carry = 0;
      int digit = 0;
      ListNode head = null;
      ListNode pre = null;

      while ((l1 != null) && (l2 != null)) {
        digit = (l1.val + l2.val + carry) % 10;
        carry = (l1.val + l2.val + carry) / 10;
        ListNode newNode = new ListNode(digit);
        if (head == null) {
          head = newNode;
        } else {
          pre.next = newNode;
        }
        pre = newNode;
        l1 = l1.next;
        l2 = l2.next;
      }

      while (l1 != null) {
        digit = (l1.val + carry) % 10;
        carry = (l1.val + carry) / 10;
        ListNode newNode = new ListNode(digit);
        if (head == null) {
          head = newNode;
        } else {
          pre.next = newNode;
        }
        pre = newNode;
        l1 = l1.next;
      }

      while (l2 != null) {
        digit = (l2.val + carry) % 10;
        carry = (l2.val + carry) / 10;
        ListNode newNode = new ListNode(digit);
        if (head == null) {
          head = newNode;
        } else {
          pre.next = newNode;
        }
        pre = newNode;
        l2 = l2.next;
      }

      if (carry != 0) {
        ListNode newNode = new ListNode(carry);
        if (head == null) {
          head = newNode;
        } else {
          pre.next = newNode;
        }
      }
      return head;
    }

    public static void main(String[] args) {
      ListNode l1 = new ListNode(2);
      l1.next = new ListNode(4);
      l1.next.next = new ListNode(3);

      ListNode l2 = new ListNode(5);
      l2.next = new ListNode(6);
      l2.next.next = new ListNode(4);

      ListNode l3 = (new Solution()).addTwoNumbers(l1, l2);

      while (l3 != null) {
        System.out.println(l3.val);
        l3 = l3.next;
      }
    }
}
