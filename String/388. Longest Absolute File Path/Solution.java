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