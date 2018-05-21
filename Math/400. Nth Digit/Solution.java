class Solution {
    public int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;
        while (n > len * count) {
            n -= len * count;
            len += 1;
            count = count * 10;
            start = start * 10;
        }
        
        start += (n - 1) / len;
        String s = Integer.toString(start);
        char ch = s.charAt((n - 1) % len);
        return ch - '0';
    }
}