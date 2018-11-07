// O(nlogMaxLen)
public class Solution {
    /**
     * @param L: Given n pieces of wood with length L[i]
     * @param k: An integer
     * @return: The maximum length of the small pieces
     */
    public int woodCut(int[] L, int k) {
        // write your code here
        int max = 0;
        for (int num : L) {
            max = Math.max(num, max);
        }
        
        int start = 1; 
        int end = max;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (!canFormK(k, mid, L)) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        
        if (canFormK(k, end, L)) {
            return end;
        }
        if (canFormK(k, start, L)) {
            return start;
        }
        return 0;
    }
    
    private boolean canFormK(int k, int len, int[] L) {
        int count = 0;
        for (int num : L) {
            count += num / len;
        }
        return count >= k;
    }
}