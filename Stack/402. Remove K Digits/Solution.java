class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        if (k == len) {
            return "0";
        }
        Stack<Character> stack = new Stack<>();
        char[] array = num.toCharArray();
        int i = 0;
        while (i < len) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > array[i]) {
                k--;
                stack.pop();
            }
            stack.push(array[i++]);
        }
        
        while (k > 0) {
            k--;
            stack.pop();
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}