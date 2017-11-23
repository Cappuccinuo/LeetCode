class Solution {
    public int countBinarySubstrings(String s) {
        int[] group = new int[s.length()];
        group[0] = 1;
        int t = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                group[t + 1] = 1;
                t = t + 1;
            }
            else {
                group[t]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < group.length - 1; i++) {
            ans += Math.min(group[i], group[i + 1]);
        }
        return ans;
    }
}