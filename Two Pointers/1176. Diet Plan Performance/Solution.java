class Solution {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int sum = 0;
        int result = 0;
        int i;
        for (i = 0; i < k - 1; i++) {
            sum += calories[i];
        }
        int len = calories.length;
        while (i < len) {
            sum += calories[i];
            result += calcPoints(sum, lower, upper);
            sum -= calories[i - k + 1];
            i++;
        }
        return result;
    }
    
    private int calcPoints(int total, int lower, int upper) {
        if (total < lower) {
            return -1;
        }
        if (total > upper) {
            return 1;
        }
        return 0;
    }
}