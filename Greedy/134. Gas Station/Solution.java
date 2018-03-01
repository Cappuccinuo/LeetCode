class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int N = gas.length;
        int total = 0;
        int sum = 0;
        int start = 0;
        for (int i = 0; i < N; i++) {
            sum += gas[i] - cost[i];
            if (sum < 0) {
                total += sum;
                sum = 0;
                start = i + 1;
            }
        }
        total += sum;
        return total < 0 ? -1 : start;
    }
}