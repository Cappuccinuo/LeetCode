class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start = 0;
        int end = 0;
        int len = nums.length;
        int zero = 1;
        int max = 0;
        
        while (end < len) {
            int num = nums[end];
            end++;
            if (num == 0) {
                zero--;
            }
            while (zero < 0) {
                int n = nums[start];
                start++;
                if (n == 0) {
                    zero++;
                }
            }
            max = Math.max(max, end - start);
        }
        return max;
    }
}
// Follow Up if the stream is large
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start = 0;
        int end = 0;
        int len = nums.length;
        int k = 1;
        int max = 0;
        Queue<Integer> zeroIndex = new LinkedList<>();
        
        while (end < len) {
            int num = nums[end];
            if (num == 0) {
                zeroIndex.offer(end);
            }
            end++;
            if (zeroIndex.size() > k) {
                start = zeroIndex.poll() + 1;
            }
            max = Math.max(max, end - start);
        }
        return max;
    }
}