class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null)
            return null;
        ListNode newHead = new ListNode(head.val);
        ListNode ind = head.next;

        while (ind != null) {
            ListNode prev = null;
            ListNode curr = newHead;
            ListNode insertNode = new ListNode(ind.val);
            while (curr != null) {
                if (ind.val < curr.val) {
                    if (prev != null) {
                        prev.next = insertNode;
                    } else {
                        newHead = insertNode;
                    }
                    insertNode.next = curr;
                    break;
                }
                prev = curr;
                curr = curr.next;
                //System.out.println("prev" + prev.val + "curr" + curr.val + "ind" + ind.val);
            }
            ind = ind.next;
            //System.out.println("******");
        }
        return newHead;
    }

    public static void main(String [] args) {
        //ListNode a = new ListNode(1);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        d.next = c;
        c.next = b;
        b.next = null;
        //a.next = null;
        // System.out.println((new Solution()).insertionSortList(d));
        ListNode newList = (new Solution()).insertionSortList(d);
        while (newList.next != null) {
          System.out.println("node is" + newList.val);
          newList = newList.next;
        }
    }
}
