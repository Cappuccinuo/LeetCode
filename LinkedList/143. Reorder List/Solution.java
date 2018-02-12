/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode firstHalf = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode secondHalf = reverseList(slow);
        merge(firstHalf, secondHalf);
    }
    
    public void merge(ListNode l1, ListNode l2) {
        while (l1 != null) {
            ListNode firstNext = l1.next;
            ListNode secondNext = l2.next;
            l1.next = l2;
            if (firstNext == null) {
                break;
            }
            l2.next = firstNext;
            l1 = firstNext;
            l2 = secondNext;
        }
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}