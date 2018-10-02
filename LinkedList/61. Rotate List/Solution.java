/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        int len = 0;
        while (fast.next != null) {
            fast = fast.next;
            len++;
        }
        
        int step = len - k % len;
        while (step > 0) {
            slow = slow.next;
            step--;
        }
        
        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;
        
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        int step = 0;
        while (temp != null) {
            temp = temp.next;
            step++;
        }
        if (k % step == 0) {
            return head;
        }
        k = k % step; 
        ListNode curr = head;
        for (int i = 1; i < step - k; i++) {
            curr = curr.next;
        }
        ListNode front = curr.next;
        curr.next = null;
        temp = front;
        for (int i = step - k + 1; i < step; i++) {
            temp = temp.next;
        }
        temp.next = head;
        return front;
    }
}