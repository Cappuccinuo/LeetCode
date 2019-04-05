class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode current = head;
        int len = 0;
        while (current != null) {
            len++;
            current = current.next;
        }
        int[] array = new int[len];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = head.val;
            head = head.next;
        }
        
        int[] res = new int[array.length];
        Stack<Integer> stack = new Stack<>();
        for (i = 0; i < array.length; i++) {
            while (!stack.isEmpty() && array[stack.peek()] < array[i]) {
                res[stack.pop()] = array[i];
            }
            stack.push(i);
        }
        return res;
    }
}