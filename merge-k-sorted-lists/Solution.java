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
 * http://blog.csdn.net/linhuanmars/article/details/19899259
 */
import java.util.List;

class ListNode {
  int val;
  ListNode next;
  ListNode(int x) {
    val = x;
    next = null;
  }
}


public class Solution {
  public ListNode mergeKLists(ArrayList<ListNode> lists) {
    if ((lists == null) && (lists.size() == 0)) {
      return null;
    }
    return mergeHelper(lists, 0, lists.size() - 1);
  }

  private ListNode mergeHelper(ArrayList<ListNode> lists, int low, int high) {
    if (low > high) {
      return null;
    }


    if (low < high) {
      int mid = low + (high - low) / 2;
      return merge2Lists(mergeHelper(lists, low, mid), mergeHelper(lists, mid + 1, high));
    }

    //Base case
    return lists.get(low);
  }

  private ListNode merge2Lists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    dummy.next = l1;
    ListNode res = dummy;
    while ((l1 != null) && (l2 != null)) {
      if (l1.val < l2.val) {
        l1 = l1.next;
        res = res.next;
      } else {
        ListNode tmp = l2.next;
        res.next = l2;
        l2.next = l1;
        l2 = tmp;
        res = res.next;
      }
    }
    if (l2 != null) {
      res.next = l2;
    }
    return dummy.next;
  }
}
