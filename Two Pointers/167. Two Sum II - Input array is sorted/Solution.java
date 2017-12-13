class Solution {
    public int[] twoSum(int[] numbers, int target) {
        return search(numbers, 0, numbers.length - 1, target);
    }
    
    public int[] search(int[] numbers, int lo, int hi, int target) {
        int[] result = new int[2];
        while (lo < hi) {
            int sum = numbers[lo] + numbers[hi];
            if (sum == target) {
                result[0] = lo + 1;
                result[1] = hi + 1;
                return result;
            }
            if (sum < target) { lo++; }
            if (sum > target) { hi--; }
        }
        return result;
    }
}