/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = reverseList(l1);
        ListNode head2 = reverseList(l2);
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;
        while (head1 != null || head2 != null || carry != 0) {
            int sum = 0;
            if (head1 != null) {
                sum += head1.val;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.val;
                head2 = head2.next;
            }
            if (carry != 0) {
                sum += carry;
            }
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }
        return reverseList(dummy.next);
    }
    
    private ListNode reverseList(ListNode head) {
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

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (p != null) {
            s1.push(p.val);
            p = p.next;
        }
        while (q != null) {
            s2.push(q.val);
            q = q.next;
        }
        
        while (!s1.isEmpty() || !s2.isEmpty()) {
            int x = (!s1.isEmpty()) ? s1.pop() : 0;
            int y = (!s2.isEmpty()) ? s2.pop() : 0;
            int sum = x + y + dummy.val;
            
            dummy.val = sum % 10;
            ListNode head = new ListNode(sum / 10);
            head.next = dummy;
            dummy = head;
        }
        return dummy.val == 0 ? dummy.next : dummy;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1 = length(l1);
        int len2 = length(l2);
        
        if (len1 > len2) {
            l2 = padList(l2, len1 - len2);
        }
        if (len1 < len2) {
            l1 = padList(l1, len2 - len1);
        }
        
        return addTwoNumbersHelper(l1, l2);
    }
    
    public ListNode addTwoNumbersHelper(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        Stack<Integer> stack = new Stack<>();
        while (l1 != null && l2 != null) {
            stack.push(l1.val);
            stack.push(l2.val);
            l1 = l1.next;
            l2 = l2.next;
        }
        while (!stack.isEmpty()) {
            int val1 = stack.pop();
            int val2 = stack.pop();
            int sum = val1 + val2 + dummy.val;
            ListNode head = new ListNode(sum / 10);
            dummy.val = sum % 10;
            head.next = dummy;
            dummy = head;
        }
        return dummy.val == 0 ? dummy.next : dummy;
    }
    
    public ListNode padList(ListNode head, int k) {
        ListNode temp = head;
        while (k > 0) {
            temp = insertBefore(temp, 0);
            k--;
        }
        return temp;
    }
    
    public ListNode insertBefore(ListNode head, int val) {
        ListNode newHead = new ListNode(val);
        newHead.next = head;
        return newHead;
    }
    
    public int length(ListNode head) {
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        return length;
    }
}