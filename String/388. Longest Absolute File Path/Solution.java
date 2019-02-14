class Solution {
    public int lengthLongestPath(String input) {
        int len = input.length();
        int[] sum = new int[len + 1];
        
        String[] levels = input.split("\n");
        int ans = 0;
        
        for (String l : levels) {
            int lastT = l.lastIndexOf("\t");
            
            int tLen = lastT + 2;
            int sLen = l.length() - (tLen - 1);

            if (l.indexOf(".") >= 0) {
                ans = Math.max(ans, sum[tLen - 1] + sLen);
            }
            else {
                sum[tLen] = sum[tLen - 1] + sLen + 1;
            }
        }
        
        return ans;
    }
}

class Solution {
    public int lengthLongestPath(String input) {
        String[] nodes = input.split("\n");
        int curLen = 0;
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for (String node : nodes) {
            int lastT = node.lastIndexOf("\t");
            int level = lastT + 2;
            while (stack.size() >= level) {
                curLen -= stack.pop() + 1;
            }
            int strLen = node.length() - (lastT + 1);
            if (node.indexOf(".") > 0) {
                ans = Math.max(ans, curLen + strLen);
            }
            else {
                curLen += strLen + 1;
                stack.push(strLen);
            }
        }
        return ans;
    }
}