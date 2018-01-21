class Solution {
    public int maxChunksToSorted(int[] arr) {
        int large = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            large = Math.max(large, arr[i]);
            if (i == large) {
                count++;
            }
        }
        return count;
    }
}