package com.sennatech.algorithm;

/**
 * Created by jinshengjie on 2016/11/6.
 * <p>
 * =======================================
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 * =======================================
 */
public class RemoveDuplicatesFromSortedListII {

    /**
     * Delete duplicates list node.
     * ======☆☆☆☆☆=======
     *
     * @param head the head
     * @return the list node
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        ListNode FakeHead = new ListNode(0);
        FakeHead.next = head;
        ListNode pre = FakeHead;
        ListNode cur = head;
        while (cur != null) {
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            if (pre.next == cur) {
                pre = pre.next;
            } else {
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return FakeHead.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }
}
