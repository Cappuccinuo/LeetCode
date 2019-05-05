class Solution {
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int len = nums.length;
        if (len < 2) {
            return 0;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        int step = 0;
        int i, j;
        
        while (!queue.isEmpty()) {
            int index = queue.poll();
            step++;
            int steps = nums[index];
            int max = -1;
            int maxIndex = -1;
            for (i = index + 1; i < len && i <= index + steps; i++) {
                if (i == len - 1) {
                    return step;
                }
                if (nums[i] + i > max) {
                    max = nums[i] + i;
                    maxIndex = i;
                }
            }
            queue.offer(maxIndex);
        }
        return step;
    }
}