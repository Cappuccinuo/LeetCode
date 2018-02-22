class Solution {
    private static int[] array;
    private static int[] origin;
    
    public Solution(int[] nums) {
        array = nums;
        origin = nums.clone();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        array = origin;
        origin = origin.clone();
        return origin;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        shuffleArray(array);
        return array;
    }
    
    public void shuffleArray(int[] a) {
        Random random = new Random();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(a, i, change);
        }
    }
    
    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */