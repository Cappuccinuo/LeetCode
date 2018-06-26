// O(n)
class Solution {
    public int arrayPairSum(int[] nums) {
        int res = 0;
        int[] count = new int[20001];
        for (int num : nums) {
            count[num + 10000] += 1;
        }
        
        boolean odd = true;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                if (odd) {
                    res += i - 10000;
                }
                odd = !odd;
                count[i]--;
            }
        }
        return res;
    }
}
// O(nlogn)
class Solution {
    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}