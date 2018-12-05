// 2018.12.5
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] result = new ListNode[k];
        int len = getLength(root);
        int average = len / k;
        int carry = len % k;
        int count = carry;
        
        for (int i = 0; i < k; i++) {
            ListNode current = root;
            ListNode prev = root;

            result[i] = current;
            if (current == null) {
                continue;
            }
            for (int j = 0; j < average; j++) {
                prev = current;
                current = current.next;
            }
            if (count > 0) {
                prev = current;
                current = current.next;
                count--;
            }
        
            prev.next = null;
            root = current;
        }
        
        return result;
    }
    
    private int getLength(ListNode root) {
        int len = 0;
        while (root != null) {
            len++;
            root = root.next;
        }
        return len;
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
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode temp = root;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        
        int team = count / k;
        int left = count % k;
        
        ListNode[] result = new ListNode[k];
        for (int i = 0; i < k; i++) {
            result[i] = root;
            for (int j = 0; j < team - 1 && root != null; j++) {
                root = root.next;
            }
            if (left > 0 && root != null && team > 0) {
                root = root.next;
                left--;
            }
            if (root != null) {
                ListNode record = root.next;
                root.next = null;
                root = record;
            }  
        }
        return result;
    }
}