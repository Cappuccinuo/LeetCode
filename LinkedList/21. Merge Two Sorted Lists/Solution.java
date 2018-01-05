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
        ListNode result = new ListNode(0);
        ListNode head = result;
        ListNode head1 = l1;
        ListNode head2 = l2;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                head.next = head1;
                head1 = head1.next;
            }
            else if (head1.val > head2.val) {
                head.next = head2;
                head2 = head2.next;
            }
            head = head.next;
        }
        if (head1 == null) {
            head.next = head2;
        }
        if (head2 == null) {
            head.next = head1;
        }
        return result.next;
    }
}

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