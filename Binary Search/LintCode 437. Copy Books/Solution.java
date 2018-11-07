public class Solution {
    /**
     * @param pages: an array of integers
     * @param k: An integer
     * @return: an integer
     */
    public int copyBooks(int[] pages, int k) {
        // write your code here
        int sum = 0;
        for (int num : pages) {
            sum += num;
        }
        
        int start = 0;
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