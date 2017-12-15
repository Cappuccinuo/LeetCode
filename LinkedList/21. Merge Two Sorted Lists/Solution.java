/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (p != null || q != null) {
            if (p == null) {
                temp.next = q;
                break;
            }
            if (q == null) {
                temp.next = p;
                break;
            }
            if (p != null && q != null) {
                if (p.val < q.val) {
                    ListNode head = new ListNode(p.val);
                    temp.next = head;
                    temp = head;
                    p = p.next;
                }
                else {
                    ListNode head = new ListNode(q.val);
                    temp.next = head;
                    temp = head;
                    q = q.next;
                } 
            }
        }
        return dummy.next;
    }
}