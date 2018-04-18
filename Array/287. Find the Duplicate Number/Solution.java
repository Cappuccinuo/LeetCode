// 2018.4.17
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int numsLen = nums.length;
        int lo = 0;
        int hi = numsLen - 1;
        while (lo < hi) {
            if (nums[lo] == nums[lo + 1]) {
                return nums[lo];
            }
            if (nums[hi] == nums[hi - 1]) {
                return nums[hi];
            }
            lo++;
            hi--;
        }
        return -1;
    }
}