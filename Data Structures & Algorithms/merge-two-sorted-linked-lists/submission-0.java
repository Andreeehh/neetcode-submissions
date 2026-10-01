/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        ListNode c1 = list1;
        ListNode c2 = list2;
        while (c1 != null || c2 != null) {
            if (c1 != null && c2 != null) {
                if (c1.val <= c2.val) {
                    current.next = c1;
                    current = c1;
                    c1 = c1.next;
                } else {
                    current.next = c2;
                    current = c2;
                    c2 = c2.next;
                }
            } else if (c1 != null) {
                current.next = c1;
                current = c1;
                c1 = c1.next;
            } else {
                current.next = c2;
                current = c2;
                c2 = c2.next;
            }
        }
        return dummy.next;
    }
}