class Solution {
    public int maximumGap(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        int gap = (int)Math.ceil((double)(max - min) / (len - 1));
        if (gap == 0) {
            return 0;
        }
        
        int[] maxBucket = new int[len - 1];
        int[] minBucket = new int[len - 1];
        int i;
        Arrays.fill(maxBucket, Integer.MIN_VALUE);
        Arrays.fill(minBucket, Integer.MAX_VALUE);
        for (i = 0; i < len; i++) {
            if (nums[i] == max || nums[i] == min) {
                continue;
            }
            int index = (nums[i] - min) / gap;
            maxBucket[index] = Math.max(maxBucket[index], nums[i]);
            minBucket[index] = Math.min(minBucket[index], nums[i]);
        }
        
        int maxDiff = 0;
        int prev = min;
        for (i = 0; i < len - 1; i++) {
            if (maxBucket[i] == Integer.MIN_VALUE || minBucket[i] == Integer.MAX_VALUE) {
                continue;
            }
            maxDiff = Math.max(maxDiff, minBucket[i] - prev);
            prev = maxBucket[i];
        }
        maxDiff = Math.max(maxDiff, max - prev);
        return maxDiff;
    }
}