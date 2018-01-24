/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        if (head.val == head.next.val && head.next.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode current = head.next;
        while (current.next != null) {
            if (slow.val == current.next.val) {
                if (current.next.next != null) {
                    return false;
                }
                current.next = null;
                slow = slow.next;
                current = slow.next;
                if (current == null || slow.val == current.val) {
                    return true;
                }
            }
            else {
                current = current.next;
            }
        }
        return false;
    }
}

// Recursive
class Solution {
    public boolean isPalindrome(ListNode head) {
        int listLen = getListLen(head);
        Result res = isPalindromeHelper(head, listLen);
        return res.result;
    }
    
    private Result isPalindromeHelper(ListNode head, int currLen) {
        if (currLen == 0) {
            return new Result(head, true);
        }
        if (currLen == 1) {
            return new Result(head.next, true);
        }
        Result ans = isPalindromeHelper(head.next, currLen - 2);
        if (!ans.result || ans.node == null) {
            return ans;
        }
        ans.result = (head.val == ans.node.val);
        ans.node = ans.node.next;
        return ans;
    }
    
    private int getListLen(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}

class Result {
    ListNode node;
    boolean result;
    Result (ListNode node, boolean result) {
        this.node = node;
        this.result = result;
    }
}

// Iterative
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        
        while (!stack.isEmpty()) {
            int val = stack.pop();
            if (slow.val != val) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}

// Reverse and compare
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        ListNode temp = slow;
        temp = reverseList(temp);
        while (count != 0) {
            if (temp.val != head.val) {
                return false;
            }
            temp = temp.next;
            head = head.next;
            count--;
        }
        return true;
    }
    
    private ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}