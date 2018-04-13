// 2018.4.12
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
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            }
            else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 == null) {
            current.next = l2;
        }
        if (l2 == null) {
            current.next = l1;
        }
        return dummy.next;
    }
}



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