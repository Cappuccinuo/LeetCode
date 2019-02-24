class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        int rightmost = 1;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num : nums) {
                sum += (num >> i) & rightmost;
            }
            // If a number is added 3 times, 
            // the corresponding bit's sum will be 3's multiple
            // e.g. 3 + 3 + 3 -> 11 + 11 + 11 -> all two bit 1 + 1 + 1 = 3
            // While the single number will leave its corresponding bit there
            // e.g. 2 -> 10 -> bit for 1 : sum = 1  using result | or to add the number's digit
            result |= (sum % 3) << i;
        }
        return result;
    }
}