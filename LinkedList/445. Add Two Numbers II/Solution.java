// 2018.4.23
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1 = getListLen(l1);
        int len2 = getListLen(l2);
        if (len1 < len2) {
            l1 = paddingList(l1, len2 - len1);
        }
        if (len2 < len1) {
            l2 = paddingList(l2, len1 - len2);
        }
        
        return addHelper(l1, l2);
    }
    
    private ListNode addHelper(ListNode l1, ListNode l2) {
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
            ListNode newNode = new ListNode(sum / 10);
            dummy.val = sum % 10;
            newNode.next = dummy;
            dummy = newNode;
        }
        return dummy.val == 0 ? dummy.next : dummy;
    }
    
    private int getListLen(ListNode head) {
        int steps = 0;
        while (head != null) {
            steps++;
            head = head.next;
        }
        return steps;
    }
    
    private ListNode paddingList(ListNode head, int len) {
        for (int i = 0; i < len; i++) {
            head = insertBefore(head, 0);
        }
        return head;
    }
    
    private ListNode insertBefore(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        return newNode;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1 = getListLen(l1);
        int len2 = getListLen(l2);
        if (len1 < len2) {
            l1 = paddingList(l1, len2 - len1);
        }
        if (len2 < len1) {
            l2 = paddingList(l2, len1 - len2);
        }
        
        PartialSum ps = addHelper(l1, l2);
        if (ps.carry != 0) {
            ListNode result = insertBefore(ps.sum, ps.carry);
            return result;
        }
        else {
            return ps.sum;
        }
    }
    
    private PartialSum addHelper(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            PartialSum ps = new PartialSum();
            return ps;
        }
        PartialSum next = addHelper(l1.next, l2.next);
        int sum = l1.val + l2.val + next.carry;
        ListNode newNode = insertBefore(next.sum, sum % 10);
        next.sum = newNode;
        next.carry = sum / 10;
        return next;
    }
    
    private int getListLen(ListNode head) {
        int steps = 0;
        while (head != null) {
            steps++;
            head = head.next;
        }
        return steps;
    }
    
    private ListNode paddingList(ListNode head, int len) {
        for (int i = 0; i < len; i++) {
            head = insertBefore(head, 0);
        }
        return head;
    }
    
    private ListNode insertBefore(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        return newNode;
    }
}

class PartialSum {
    ListNode sum = null;
    int carry = 0;
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        ListNode h1 = reverseList(l1);
        ListNode h2 = reverseList(l2);
        int carry = 0;
        while (h1 != null || h2 != null || carry != 0) {
            int val1 = h1 == null ? 0 : h1.val;
            int val2 = h2 == null ? 0 : h2.val;
            int sum = val1 + val2 + carry;
            ListNode currentNode = new ListNode(sum % 10);
            carry = sum / 10;
            current.next = currentNode;
            current = current.next;
            h1 = h1 == null ? h1 : h1.next;
            h2 = h2 == null ? h2 : h2.next;
        }
        return reverseList(dummy.next);
    }
    
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
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