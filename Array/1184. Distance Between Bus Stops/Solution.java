class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }
        int len = distance.length;
        int[] prefixSum = new int[len + 1];
        int i;
        prefixSum[0] = 0;
        for (i = 1; i < len + 1; i++) {
            prefixSum[i] = prefixSum[i - 1] + distance[i - 1];
        }
        
        return Math.min(prefixSum[destination] - prefixSum[start], 
                        prefixSum[start] + prefixSum[len] - prefixSum[destination]);
    }
}