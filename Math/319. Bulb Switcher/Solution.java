class Solution {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
}

// TLE
class Solution {
    public int bulbSwitch(int n) {
        boolean[] bulbs = new boolean[n];
        int count = n;
        int step;
        int start;

        while (count > 0) {
            start = n - count;
            step = n - count + 1;
            while (start < n) {
                bulbs[start] = !bulbs[start];
                start = start + step;
            }
            count--;
        }
        
        int res = 0;
        int i;
        for (i = 0; i < n; i++) {
            res += bulbs[i] ? 1 : 0;
        }
        return res;
    }
}