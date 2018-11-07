// O(nlogMaxLen)
public class Solution {
    /**
     * @param L: Given n pieces of wood with length L[i]
     * @param k: An integer
     * @return: The maximum length of the small pieces
     */
    public int woodCut(int[] L, int k) {
        // write your code here
        long sum = 0;
        for (int num : L) {
            sum += (long)num;
        }
        
        long start = 1;
        long end = sum;
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            if (!canFormK(k, mid, L)) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        
        if (canFormK(k, end, L)) {
            return (int)end;
        }
        if (canFormK(k, start, L)) {
            return (int)start;
        }
        return 0;
    }
    
    private boolean canFormK(int k, long len, int[] L) {
        int count = 0;
        for (int num : L) {
            count += (long)num / len;
        }
        return count >= k;
    }
}