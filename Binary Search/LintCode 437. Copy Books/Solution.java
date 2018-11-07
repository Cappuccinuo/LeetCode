public class Solution {
    /**
     * @param pages: an array of integers
     * @param k: An integer
     * @return: an integer
     */
    public int copyBooks(int[] pages, int k) {
        // write your code here
        if (pages == null || pages.length == 0) {
            return 0;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int num : pages) {
            sum += num;
            max = Math.max(num, max);
        }
        
        int start = max;
        int end = sum;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (canFinish(pages, mid, k)) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        
        if (canFinish(pages, start, k)) {
            return start;
        }
        if (canFinish(pages, end, k)) {
            return end;
        }
        return -1;
    }
    
    private boolean canFinish(int[] pages, int time, int k) {
        int count = 0;
        int index = 0;
        while (index < pages.length) {
            int sum = 0;
            
            while (index < pages.length && sum <= time) {
                sum += pages[index];
                if (pages[index] > time) {
                    return false;
                }
                if (sum > time) {
                    break;
                }
                index++;
            }
            count++;
        }
        return count <= k;
    }
}